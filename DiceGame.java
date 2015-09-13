package STEP2015;

import java.util.Scanner;
import java.util.Random;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DiceGame diceGame = new DiceGame();
		diceGame.dicePlayer();

	}

	public void dicePlayer() {
		int humanScore = 0;
		int computerScore = 0;
		int score = 0;
		int counter = 1;
		boolean isFirstRound = true;
		
		System.out.println("Welcome to the game of Pig!\n");
		
		while (humanScore < 100 && computerScore < 100) {
			
			System.out.println("Looping ...");
			
			// Computer turn			
			while ((score = 1 + (int) (6 * Math.random())) != 1 && computerScore < 100) {
				
				computerScore += score;
				System.out.println("Computer: " + score);
				if (isFirstRound) {
					if (counter < 3) {
						computerScore += score;
					} else {
						break;
					}

				} else {
					computerScore += score;
					
				}
				counter++;
			}
			isFirstRound = false;
			
			score = 0;
			System.out.println("You lose your turn! Your total is " + score);
			// Human turn
			while ((score = 1 + (int) (6 * Math.random())) != 1 && humanScore < 100) {
				System.out.println("Human: " + score);
				
				humanScore += score;

			}

		}

		if (humanScore >= 100) {
			System.out.println("Winner is the Human with score " + humanScore);
		} else {
			System.out.println("Winner is the Computer with score " + computerScore);
		}
	}



}
