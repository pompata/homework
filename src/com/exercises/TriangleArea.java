package com.exercises;
import java.util.Scanner;
public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] numberString = line.split(" ");
		//a;
		int ax = Integer.parseInt(numberString[0]);
		int ay = Integer.parseInt(numberString[1]);
		//b
		line = input.nextLine();
		numberString = line.split(" ");
		int bx = Integer.parseInt(numberString[0]);
		int by = Integer.parseInt(numberString[1]);
		//c
		line = input.nextLine();
		numberString = line.split(" ");
		int cx = Integer.parseInt(numberString[0]);
		int cy = Integer.parseInt(numberString[1]);
		
		int area = Math.abs((ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2);
		System.out.println(area);
	}

}
