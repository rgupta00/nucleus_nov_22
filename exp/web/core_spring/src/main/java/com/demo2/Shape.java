package com.demo2;
import java.util.*;
public class Shape {
	
	private List<Point> points;

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void printShape() {
		points.forEach(p-> System.out.println(p));
	}

}
