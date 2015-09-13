package STEP2015;
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		double x = 0;
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a value for X ");
		x = input.nextDouble();
		double quad = 0;
		
		quad = (3*Math.pow(x, 2)) - (8*x) + 4;
		System.out.println("At X = "+x+" the value is " + quad);
	}

}
