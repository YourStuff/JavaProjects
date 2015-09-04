package STEP2015;

import java.util.Scanner;
public class discountPrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double discount = 0.1;
		int purch;
		Scanner input = new Scanner(System.in);
		System.out.println("Please entre the amount of your purchase ");
		
		purch = input.nextInt();
		if (purch >1000){
		purch = (int) (purch - (purch*discount));
		System.out.println("Your discounted price is " + purch);
		
		
		}
		else{
			System.out.println("No discount for you. You have to pay " + purch);
		}
	}

}
