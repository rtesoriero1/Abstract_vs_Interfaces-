package com.lemon.abstract_vs_interfaces;

import java.lang.reflect.Array;

public abstract class GeometricObject implements Comparable<GeometricObject>{

	
	
	
protected int sideOne; 
protected int sideTwo;
protected int sideThree;
protected int radius; 
protected String color; 
protected boolean filled; 
protected int diameter; 
protected int length;
protected int width; 

//Building Comparison 
public static String max( GeometricObject a, GeometricObject b) { 
	if ( a.calculateArea() == b.calculateArea()) { 
		return (String) "They are equal"; 
	} else if (a.calculateArea() > b.calculateArea())
	return "First object is bigger"; 
	else {
	return "Second object is bigger"; }
}


	public GeometricObject() { 
		 sideOne= 0;  
		sideTwo= 0; 
		sideThree= 0; 
		color = ""; 
		filled= false; 
		radius= 0; 
		diameter= 0; 
		length = 0;
		width = 0; 
		}

	public Object getSides() {
		int[] sidesOfTriangle = {sideOne, sideTwo, sideThree}; 
		return sidesOfTriangle;
	}

	public void setSides(int sideOne, int sideTwo, int sideThree) {
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public String setFilled() {
		this.filled = !filled;
		if (filled = true) {
			return "True";
		} else
		return "False";
	}
		
	//declaring calculations 
		abstract public double calculatePerimeter();
		abstract public double calculateArea(); 
		
		
		}

	

