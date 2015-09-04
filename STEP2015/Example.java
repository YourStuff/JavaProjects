package STEP2015;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long hoursWorked = 40;
		double payRate   = 10.0, taxRate = 0.10 ;
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Pay Amount  : " + (hoursWorked * payRate));
		System.out.println("Tax Amount  : " + (hoursWorked * payRate * taxRate));
		
		//hoursWorked cannot be resolved to a variable by itself
		//payRate cannot be resolved to a variable by itself
		//taxRate cannot be resolved to a variable by itself
		
		//whenever the value of the variable is changed the output is changed too.
		//removing one of declaration break the program.
		//deleting any character from the variable ----> break program. 
		
	}

}
