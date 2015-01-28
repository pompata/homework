package com.exercises;
import java.util.Scanner;


public class CountOfBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String bits = Integer.toBinaryString(number);
		int count = 0;
		char bit;
		for(int i = 0;i<bits.length()-1;i++){
			bit = bits.charAt(i);
			if(bits.charAt(i+1)==bit){
				count++;
			}
		}
		System.out.printf("%1$s = %2$s , %3$s pairs.",number,bits,count);
	
	}

}
