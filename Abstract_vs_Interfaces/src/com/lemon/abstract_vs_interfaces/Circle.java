package com.lemon.abstract_vs_interfaces;

public class Circle extends GeometricObject{

	@Override
	public int compareTo(GeometricObject o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = Math.PI*2*(diameter); 
		return perimeter;
	}

	@Override
	public double calculateArea() {
		double area = Math.PI * Math.pow(radius, 2); 
		return area;
	}
	

}
