/*6.3-Write a program to display a triangle with a height of n stars (*), n is entered by users.
 * Vu Thuong Dat-20215031*/
package lab01;
import  java.util.Scanner;
public class Ex6_3 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j = 1; j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
