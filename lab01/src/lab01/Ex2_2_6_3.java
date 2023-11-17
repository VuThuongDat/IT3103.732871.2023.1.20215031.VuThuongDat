/*2.2.6.3-solve the second-degree equation with one variable
 * Vu Thuong Dat-20215031*/
package lab01;
import java.util.Scanner;
public class Ex2_2_6_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		double a = scanner.nextDouble();
		System.out.print("Enter the value of b: ");
		double b = scanner.nextDouble();
		System.out.print("Enter the value of c: ");
		double c = scanner.nextDouble();
		double delta = b * b - 4 * a * c;
		if (a == 0) {
			System.out.println("This is not a quadratic equation.");
		} else if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("The solutions of the equation are: x1 = " + x1 + ", x2 = " + x2);
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("The equation has a double root: x = " + x);
		} else {
			System.out.println("The equation has no real roots.");
		}
	}
}
