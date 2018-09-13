package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class Services implements EmployeeServices {
	
	Employee employee = new Employee();
	
	@Override
	public String getInsuranceScheme(double salary, String designation){
		
		String insuranceScheme = "";
		
if ((5000 < salary && salary < 20000) && designation.equalsIgnoreCase("System Associate")) {
			
			insuranceScheme = "Scheme C";
		} else if ((20000 <= salary && salary < 40000) && designation.equalsIgnoreCase("Programmer")) {
			
			insuranceScheme = "Scheme B";

		} else if (40000 <= salary && designation.equalsIgnoreCase("Manager")) {
			
			insuranceScheme = "Scheme A";

		} else if ( salary < 5000 && designation.equalsIgnoreCase("Clerk")){
			
			insuranceScheme = "No Scheme";
		} else {
			System.out.println("The salary and designation do not match up to an insurance scheme.");
			return insuranceScheme;
		}
		
		return insuranceScheme;
	}
	
	@Override
	public void displayEmpDetails() {
		
		int id = employee.getId();
		String name = employee.getName();
		double salary = employee.getSalary();
		String designation = employee.getDesignation();
		
		String insuranceScheme = getInsuranceScheme(salary, designation);
		
		System.out.println("Here are the Employee Details:");
		System.out.println("-------------------------------");
		System.out.println("Employer id: " + id);
		System.out.println("Employer name: " + name);
		System.out.println("Employer salary: " + salary);
		System.out.println("Employer designation: " + designation);
		System.out.println("Employer insuranceScheme: " + insuranceScheme);

	}
	
	@Override
	public void getEmployeeDetail(int id, String name, double salary, String designation) {
		
		
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDesignation(designation);
		
		displayEmpDetails();
	}
}