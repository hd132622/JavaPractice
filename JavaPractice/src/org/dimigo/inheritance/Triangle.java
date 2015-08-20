package org.dimigo.inheritance;

public class Triangle extends Figure {
	
	private int width;
	private int height;
	
	public Triangle(int width, int height){
		super(0,0);
		this.width = width;
		this.height = height;
	}
	
	public Triangle(int centerX, int centerY, int width, int height){
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea(){
		return (0.5 * width * height);
	}
	
	protected void printCenter(){
		System.out.print("삼각형 ");
		super.printCenter();
	}
}