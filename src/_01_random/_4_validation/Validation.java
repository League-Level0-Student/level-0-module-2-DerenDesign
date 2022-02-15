//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		//System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
	
		if (randomNumber == 0) {
			System.out.print("I like your shirt.");
		}
		else if (randomNumber == 2){
			System.out.print("I like your car.");

		}
		else if (randomNumber == 3){
			System.out.print("I like your pants.");

		}
		else if (randomNumber == 4){
			System.out.print("I like your shoes.");

		}
		else if (randomNumber == 5){
			System.out.print("I like your socks.");

		}
		else if (randomNumber == 1){
			System.out.print("I like your phone.");

		}

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
