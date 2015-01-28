package com.exercises;
import java.util.Scanner;

public class PointsInsideFigure {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] numbers = line.split(" ");
		double x = Double.parseDouble(numbers[0]);
		double y = Double.parseDouble(numbers[1]);
		if(first(x,y) || second(x,y) || third(x,y)){
			System.out.println("Inside");
		}
		else{
			System.out.println("Outside");
		}
	}
	public static boolean first(double x,double y){
		return (x>=12.5 && x<=22.5 && y>=6 && y<8.5);
	}
	public static boolean second(double x,double y){
		return (x>=12.5 && x<=17.5 && y>=8.5 && y<13.5);
	}
	public static boolean third(double x,double y){
		return (x>=20 && x<=22.5 && y>=8.5 && y<13.5);
	}

}
