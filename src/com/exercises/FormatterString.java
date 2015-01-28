package com.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FormatterString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int a;
			double b, c;
			
			System.out.println("Enter a >= 0, <= 500:");
			a = in.nextInt();
			while(a < 0 || a > 500) {
				System.out.println("Invalid value!");
				System.out.println("Enter a >= 0, <= 500:");
				a = in.nextInt();
			}
			
			System.out.println("Enter b:");
			b = in.nextDouble();
			System.out.println("Enter c:");
			c = in.nextDouble();
			
	
			System.out.print(String.format("%-10s", Integer.toHexString(a)).toUpperCase());
			System.out.print("|");
			System.out.print(String.format("%10s", Integer.toBinaryString(a)).replace(" ", "0"));
			System.out.print("|");
			System.out.print(String.format("%10s", new DecimalFormat("0.00").format(b)));
			System.out.print("|");
			System.out.print(String.format("%-10s", new DecimalFormat("0.000").format(c)));
			System.out.println("|");
		}
	}
}