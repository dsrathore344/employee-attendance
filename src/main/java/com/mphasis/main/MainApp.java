package com.mphasis.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.dao.EmployeeDaoImpl;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		EmployeeDaoImpl empDao = context.getBean("employeeDaoImpl", EmployeeDaoImpl.class);
		
		System.out.println("Enter your Employee ID");
		int empId = sc.nextInt();
		
		if(!empDao.isEmployeeHasSignedIn(empId)) {
			System.out.println("Enter your Name");
			String name = sc.next();
			//sc.next();
			empDao.inEmployee(empId, name);
		}
		
		else {
			empDao.outEmployee(empId);
		}
		
		
		
		
		
				
		
		
	}

}
