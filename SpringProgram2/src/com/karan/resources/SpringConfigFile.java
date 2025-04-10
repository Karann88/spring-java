package com.karan.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.karan.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean("stdObj1")
	public Student createStdBeanObj1() {
		Student std = new Student();
		std.setName("Kamal");
		std.setRollno(103);
		std.setEmail("kamal011@gmail.com");
		
		return std;
	}
	
	@Bean("stdObj2")
	public Student createStdBeanObj2() {
		Student std = new Student();
		std.setName("Karan");
		std.setRollno(104);
		std.setEmail("karanjangid033@gmail.com");
		
		return std;
	}
}
