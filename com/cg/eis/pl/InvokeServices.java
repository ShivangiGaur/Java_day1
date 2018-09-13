package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Services;

public class InvokeServices {
	void getEmployeeDetail(int id, String name,double salary, String designation){
		Services ser = new Services();
		ser.getEmployeeDetail(id, name, salary, designation );
		
	}
	
	private void displayEmpDetails(){
		Services ser = new Services();
		ser.displayEmpDetails();
	}

	public static void main(String[] args){
		InvokeServices services = new InvokeServices();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id:");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name:");
		String name = sc.next();
		System.out.println("Enter Employee salary:");
		double salary = sc.nextLong();
		System.out.println("Enter Employee designation:");
		String designation = sc.next();
		

		services.getEmployeeDetail(id, name, salary, designation);
	}
}
