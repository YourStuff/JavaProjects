package STEP2015;
	
	
	import java.lang.Math;
	import java.util.Random;
	import java.util.Scanner;

	public class JusGame {
		
		Random rand = new Random();
		int numberToGuess = rand.nextInt(10);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		
		int guess;
		
		boolean win = false;
		
		while (win == false) {
		
		System.out.println("Guess a number between 1 and 10: ");
		guess = input.nextInt();
		numberOfTries++;
		
		if (guess == numberToGuess) {
			win = true;
		}
		
		if (guess == numberToGuess) {
			
		}
		
		else if (guess < numberToGuess) {

			System.out.println("Your guess is too low");
			
		}
		
		else if (guess > numberToGuess) {
			
			
			System.out.println("Your guess is too high");
		}
		
		
		}
		
		System.out.println("You win!");
		System.out.println("The number was " + numberToGuess);
		System.out.println("It took you " + numberOfTries + " tries");

	}
	
	
	
}

}

