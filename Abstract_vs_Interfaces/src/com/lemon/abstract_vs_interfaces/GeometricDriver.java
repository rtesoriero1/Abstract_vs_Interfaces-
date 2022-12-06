package com.lemon.abstract_vs_interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class GeometricDriver {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Triangle obj = new Triangle(); 
		
		//Input the color of the triangle 
		System.out.println("Please input the color of the triangle"); 
		obj.setColor(input.next());
		
		//Ask if triangle should be filled
		System.out.println("Should the triangle be filled with this color? Please input '1' to fill it" );
		int choice = input.nextInt();
		if (choice == 1) {
			obj.setFilled();
		} else {
			obj.isFilled();
		}
		
		//Display if the triangle is filled and what color it is  
		System.out.println("It is " + obj.isFilled()+ " that this triangle is filled with the color: " +obj.getColor());
		
		
		//Input the sides of the triangle 
		System.out.println("Please input the sides of the triangle"); 
		obj.setSides(input.nextInt(), input.nextInt(), input.nextInt());
		
		
		//Display the perimeter of the triangle 
		System.out.println("The perimeter of the triangle is: " + obj.calculatePerimeter()); 
		
		//Display the area of the triangle 
		System.out.println("The area of the triangle is: " + obj.calculateArea());
		
		//Adding grades to the array 
		ArrayList<Number> grades = new ArrayList<Number>(); 
		grades.add(0, 82);
		grades.add(1, 89);
		grades.add(2, 100);
		grades.add(3, 72);
		grades.add(4, 80);
		
		
		System.out.println("Here are the grades before they are sorted: ");
		 System.out.println(grades);
		 
		 //Using the sorting method from Triangles on the array 
		 Triangle.gradeDetails(grades); 
		 
		 System.out.println("Here are the grades after they are sorted: ");
		 System.out.println(grades);
		}

	
		
		
		
		
	
	
		
		
		
	}


