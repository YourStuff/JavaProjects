package STEP2015;
import java.util.Scanner;

public class centsDollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cents= 0;
		int dollars;
		int rest;
		Scanner input = new Scanner(System.in);
		System.out.println("Please convert your cents to dollars: ");
		cents = input.nextInt();
		
		dollars = cents/100;
		rest = cents%100;
		
		
	
		
		
		System.out.println("That is " + " " + dollars + " Dollars and" + " " + rest + " Cents");
		
		
		
	}

}
