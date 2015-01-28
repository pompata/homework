package com.exercises;
import java.util.Scanner;


public class CountBits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String bits = Integer.toBinaryString(number);
		int count = 0;
		for(int i = 0;i<bits.length();i++){
			if(bits.charAt(i)=='1'){
				count++;
			}
		}
		System.out.printf("%1$s = %2$s , %3$s occurances.",number,bits,count);
	
	}

}
