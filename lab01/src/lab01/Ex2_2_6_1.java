/*2.2.6.1-solve the first-degree equation (linear equation) with one variable
 * Vu Thuong Dat-20215031*/
package lab01;

import java.util.Scanner;

public class Ex2_2_6_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		double a = input.nextDouble();
		System.out.print("Enter the value of b: ");
		double b = input.nextDouble();
		if (a == 0) {
			if (b == 0) {
				System.out.println("The equation has infinitely many solutions.");
	    	} else {
	    		System.out.println("The equation has no solution");}
			} else {
	        	double x = -b / a;
	        	System.out.println("The solution of equation is: " + x);}
		}
}
