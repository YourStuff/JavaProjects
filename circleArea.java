package STEP2015;
import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class circleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double pi;
		double radius = 0;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the radius: ");
		radius = input.nextDouble();
		area = Math.PI*Math.pow(radius, 2);
		System.out.println("The area of the " + radius + " " + "is" + " " + area);
	
	}

}
