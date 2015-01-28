package com.exercises;
import java.util.Arrays;
import java.util.Scanner;


public class SmallestOfThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[3];
		numbers[0] = input.nextDouble();
		numbers[1] = input.nextDouble();
		numbers[2] = input.nextDouble();
		Arrays.sort(numbers);
		System.out.println(numbers[0]);
	}

}
