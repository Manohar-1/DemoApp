package com.masai.Shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {



	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		DrawTheShapes dts = ctx.getBean(DrawTheShapes.class,"dts");  
		
		Circle c = ctx.getBean(Circle.class,"circle"); 
		
		
		dts.drawShapes();
		
//		DrawTheShapes dts = new DrawTheShapes(); 
//
//		dts.setShape(new Circle());
//
//		dts.drawShapes();
//
//		dts.setShape(new Cylinder());
//
//		dts.drawShapes();
//
//		dts.setShape(new Triangle());
//
//		dts.drawShapes();
	}

}
