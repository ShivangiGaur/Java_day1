package com.cg.eis.service;

public interface EmployeeServices {

String getInsuranceScheme(double salary, String designation);
	
	void displayEmpDetails();
	void getEmployeeDetail(int id, String name, double salary, String designation);
}