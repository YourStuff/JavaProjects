package STEP2015;
import java.util.Scanner;
public class orderChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int bolts = 0;
		int nuts = 0;
		int wachers = 0;
		int total;
		int doub;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the numbers of your bolts, nuts and wachers: ");
		bolts = input.nextInt();
		nuts = input.nextInt();
		wachers = input.nextInt();
		total = bolts + nuts + wachers;
		doub = 2*bolts;
		if (bolts == nuts && wachers == doub){
		
		
		}
		if  (bolts>nuts){
			System.out.println("Ordre has an error, please check the order: too few nuts" );
		}else if (nuts>bolts){
			System.out.println("Ordre has an error, please check the order: too few bolts" );
		}else if (wachers<doub) {
			System.out.println("Ordre has an error, please check the order: too few washers" );
			
		}else{
			System.out.println("The ordre is OK, Your total purchase is: " + " " + total);
		}
			
				
			
		}
	}

