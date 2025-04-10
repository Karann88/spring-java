package com.karan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.karan.beans.Student;

// To activate the Spring Container - Main Class 
public class Main {
	
	public static void main(String[] args) {
		String config_loc = "/com/karan/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student std1 = (Student) context.getBean("stdId1");
		std1.display();
		
		System.out.println("---------------");
		
		Student std2 = (Student) context.getBean("stdId2");
		std2.display();
	}
}

// 1. spring-beans-xxx.jar
// 2. spring-core-xxx.jar
// 3. spring-context-xxx.jar
// 4. common-logging-xxx.jar
// 5. spring-expression-xxx.jar
