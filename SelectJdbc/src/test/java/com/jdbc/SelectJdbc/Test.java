package com.jdbc.SelectJdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.bean.Employee;
import com.jdbc.dao.CustomerDetails;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ksoft/config/application-contect.xml");
		CustomerDetails customerDetails = context.getBean("customerDetails", CustomerDetails.class);

		Employee employee2 = new Employee();
		employee2.setEid(10);
		employee2.setName("banana");
		employee2.setSalary(55000);
		
		//customerDetails.saveEmployeeDetails(8, "Apple", 4545);
		customerDetails.saveEmployeeDetails(employee2);
		
		System.out.println(customerDetails.findAllDetails());
	}

}
