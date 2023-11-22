/*6.5-Write a Java program to sort a numeric array, and calculate the sum and average value of array elements.
 * Vu Thuong Dat-20215031*/
package hust.soict.dsai.lab01;
import java.util.Arrays;
public class Ex6_5 {
	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 1, 9};
		
		
		Arrays.sort(arr);
		
		// Calculate the sum of array elements
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		// Calculate the average value of array elements
		double average = (double) sum / arr.length;
		
		// Print the results
		System.out.println("Sorted array: " + Arrays.toString(arr));
		System.out.println("Sum of array elements: " + sum);
		System.out.println("Average value of array elements: " + average);
	}
}
