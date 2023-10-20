package com.GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	
	public static void main(String[] args) {

		int givenNum;
		int guess;
		int chanceCount = 0;
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		givenNum = random.nextInt(100) + 1;
		
		System.out.println("Welcome to the Guessing Game!");
		System.out.println("How many chances would you like to have? (from 1 to 10)");
		chanceCount = sc.nextInt();
		
		while( chanceCount < 1 || chanceCount > 10) {
			System.out.println("You can choose from 1 to 10");
			chanceCount = sc.nextInt();
		}
		
		System.out.println("Let`s start the game!");
		System.out.println("Guess number from 1 to 100");
		
		guess = sc.nextInt();
		
		for (int i = 0; i < chanceCount + 1; i++) {
			if((i+1) == chanceCount) {
				System.out.println("You lost! :( Correct number: " + givenNum);
				break;
			}else if (guess > givenNum){
				System.out.println("Lower! You have " + (chanceCount - i - 1) + " chance(s) left!");
				guess = sc.nextInt();
			}else if (guess < givenNum){
				System.out.println("Higher! You have " + (chanceCount - i - 1) + " chance(s) left!");
				guess = sc.nextInt();
			}else if (guess == givenNum) {
				System.out.println("Congratulations! You win!");
				break;
			}
		}
		sc.close();
		
	}
	
}
