/*2.2.5.1-Vu Thuong Dat 20215031*/
package lab01;
import java.util.Scanner;
public class Ex2_2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = input.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = input.nextDouble();
		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		double quotient = num1 / num2;
		System.out.printf("Sum: %.2f\nDifference: %.2f\nProduct: %.2f\nQuotient: %.2f", sum, difference, product, quotient);
		}

}
