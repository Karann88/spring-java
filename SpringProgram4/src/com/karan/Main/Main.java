package com.karan.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.karan.beans.Student;

public class Main {
	public static void main(String[] args) {
		String config_file_loc = "/com/karan/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file_loc);
		
		Student std = (Student) context.getBean("stdId");
		std.display();
	}
}
