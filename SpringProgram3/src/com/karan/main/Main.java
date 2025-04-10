package com.karan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.karan.beans.Student;

public class Main {
	public static void main(String[] args) {
		String resource_file_path = "/com/karan/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);
		
		Student std = (Student) context.getBean("student");
		std.display();
	}
}
