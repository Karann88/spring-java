package com.karan.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.karan.beans")
//@ComponentScan({"com.karan.beans"})
@ComponentScan(basePackages = {"com.karan.beans"})
public class SpringConfigFile {
	
}
