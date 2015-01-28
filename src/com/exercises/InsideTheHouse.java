package com.exercises;
import java.awt.Rectangle;
import java.awt.geom.Path2D;
import java.util.Scanner;

public class InsideTheHouse {
	public static void main(String[] args) {
		double[] xx = {12.5,12.5,17.5,17.5,20,20,22.5,22.5,17.5};
		double[] yy = {8.5,13.5,13.5,8.5,8.5,13.5,13.5,8.5,3.5};
		Path2D shape = new Path2D.Double();
		shape.moveTo(xx[0], yy[0]);
		for(int i=1;i<xx.length;++i){
			shape.lineTo(xx[i], yy[i]);
		}
		shape.closePath();
		Rectangle bounds = new Rectangle();
		bounds = shape.getBounds();
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		if(bounds.contains(x,y)&& shape.contains(x,y)){
			System.out.println("Inside");
		}
		else{
			System.out.println("Outside");
		}
	}
}
