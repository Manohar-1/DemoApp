package com.masai.Shapes;

public class DrawTheShapes {
 
	Shape s; 
	
	public void setShape(Shape s) {
	     this.s=s;
	}
	
	public void drawShapes() {
		s.drawTheShape();
	}
	
}
