package STEP2015;
import java.util.Random;
import java.util.Scanner;
public class RandomN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double guess;
		Random rn = new Random();
		Scanner bob = new Scanner(System.in);
		int answer = (int)(10.0 * Math.random());
		
		for(int i =0; i < 3; i++)
		{
			System.out.println("Please guess a number: ");
			guess = bob.nextDouble();
			
			if (guess != answer){
				 System.out.println("wrong");
			 }
		      else if (guess == answer) {
			     System.out.println("RIGHT!");
			}		    
		    
		}
		
		System.out.println("The answer is :"+answer);
		
		 
		 

	


	}
}

