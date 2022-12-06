package com.lemon.abstract_vs_interfaces;

public class Rectangle extends GeometricObject {

	@Override
	public int compareTo(GeometricObject o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = 2* (length + width); 
		return perimeter;
	}

	@Override
	public double calculateArea() {
		double area = length * width; 
		return area;
	}

}
