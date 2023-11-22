/*2.2.6.2-solve the system of first-degree equations (linear system) with two variables
 * Vu Thuong Dat-20215031*/
package hust.soict.dsai.lab01;
import java.util.Scanner;
public class Ex2_2_6_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of a11: ");
		double a11 = scanner.nextDouble();
		System.out.print("Enter the value of a12: ");
		double a12 = scanner.nextDouble();
		System.out.print("Enter the value of b1: ");
		double b1 = scanner.nextDouble();
		System.out.print("Enter the value of a21: ");
		double a21 = scanner.nextDouble();
		System.out.print("Enter the value of a22: ");
		double a22 = scanner.nextDouble();
		System.out.print("Enter the value of b2: ");
		double b2 = scanner.nextDouble();
		double D = a11 * a22 - a21 * a12;
		double D1 = b1 * a22 - b2 * a12;
		double D2 = a11 * b2 - a21 * b1;
		if (D != 0) {
			double x1 = D1 / D;
			double x2 = D2 / D;
			System.out.println("The solution to the system of equations is: x1 = " + x1 + ", x2 = " + x2);
		} else {
			if (D1 == 0 && D2 == 0) {
				System.out.println("The system of equations has infinitely many solutions.");
			} else {
				System.out.println("The system of equations has no solution.");
			}
		}
	}
}
