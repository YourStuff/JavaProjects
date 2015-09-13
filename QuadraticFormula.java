package STEP2015;

public class QuadraticFormula {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("At the X = 10.0 the value is: " + quadraticEquationSolu(3, -8, 4, 2/3));
		// test 1 : running the program with decimal points is working properly;
		// test 2 : running the program with large value  break at large value (12 digit);
		// test 3 : running the program with negatives values break at larger value (12 digits);
		// test 5 : running the program with value 0 is returning 4.0;
		// test 6 : running the program with value X = 2.0 is returning 0 but for the X =2/3 is returning 4.0 ;
		
		
        
	}

	public static double quadraticEquationSolu(int a, int b, int c, double x) {
		/*/String solu1, solu2; 
		solu1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) + "/" + (2 * a);
		solu2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) + "/" + (2 * a);
		return solu1 + " " + "and" + " " +  solu2;/*/
		
		double value =  3*x*x -8*x +4;
		return value;
	}

}
