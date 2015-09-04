package STEP2015;
import java.util.Random;
import java.util.Scanner;
public class ImprovedGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double guess;
		
		Scanner bob = new Scanner(System.in);
		int answer = (int)(10.0 * Math.random());
		
		for(int i =0; i < 3; i++){
			
			System.out.println("Please guess a number between 1 and 10 : ");
			guess = bob.nextDouble();
			
			if (guess>10){
				System.out.println("This number is out of range please guess between 1 and 10");
			}
			
			
				
			 if  (guess == answer) {
			     System.out.println("RIGHT!");
	          }    
			else if ((answer == guess + 1) || (answer == guess - 1)) {
					
					 System.out.println("hot, please try again");
				 
				 }
				else if ((answer == guess + 2) || (answer == guess - 2)){
				     System.out.println("warm!, please try again");
			      }
				   else if ((answer == guess + 3) || (answer == guess - 3)){
					     System.out.println("cold!, please try again"); 
				 			   
				   }
				   else if (i == 2){
					   System.out.println("You loose "); 
					     
				   }else {
					     System.out.println("cold!, please try again"); 
			 			   
				   }
				
				
			         
			   
			  
		}
		System.out.println("The answer is :"+answer);
		
		
}
}