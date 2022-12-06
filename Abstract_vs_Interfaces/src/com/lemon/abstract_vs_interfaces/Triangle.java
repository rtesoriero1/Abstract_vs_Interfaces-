package com.lemon.abstract_vs_interfaces;

import java.util.ArrayList;

public class Triangle extends GeometricObject {

	
	
	
	//Sorting the Array 
	public static void gradeDetails(ArrayList<Number>grades){
		grades.sort(null);
		
	}



	@Override
	public double calculatePerimeter() {
		double perimeter = sideOne + sideTwo + sideThree; 
		return perimeter;
	
	}

	@Override
	public double calculateArea() {
		double semiPerimeter = (sideOne + sideTwo + sideThree)/2; 
		double area = Math.sqrt( semiPerimeter*((semiPerimeter - sideOne)* (semiPerimeter - sideTwo) * (semiPerimeter - sideThree)));
		return area;
	}



	@Override
	public int compareTo(GeometricObject o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

