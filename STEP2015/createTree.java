package STEP2015;

import java.util.Scanner;

public class createTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i = 0;
		 int j = 0;
         int lenght = 10;
         
         System.out.println("Build your tree, enter a number: ");
         Scanner input = new Scanner(System.in);
         lenght = input.nextInt();
		    while (i < lenght) {
		        
		        i++;
		        while(j<i){
		        	System.out.print("*");
			        j++;
			        
		        }
		        System.out.println("");
		        j =0;
		    } 
		       
                
}
}