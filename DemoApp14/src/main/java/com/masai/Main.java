package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Travel trew = ctx.getBean(Travel.class,"t"); 
		
		Vehicle c = ctx.getBean(Car.class, "c"); 
		c.go();
		
		trew.journey();
		

	}

}
