/*6.4-Write a program to display the number of days of a month
 * Vu Thuong Dat-20215031*/
package hust.soict.hedspi.lab01;
import java.util.Scanner;
public class Ex6_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Nhập tháng và năm từ người dùng
		System.out.print("Month: ");
		String monthInput = scanner.nextLine();
		System.out.print("Year: ");
		int year = scanner.nextInt();
		// Chuyển đổi tháng thành số
		int month;
		if (monthInput.equalsIgnoreCase("January") || monthInput.equalsIgnoreCase("Jan.") || monthInput.equalsIgnoreCase("Jan") || monthInput.equals("1")) {
			month = 1;
		} else if (monthInput.equalsIgnoreCase("February") || monthInput.equalsIgnoreCase("Feb.") || monthInput.equalsIgnoreCase("Feb") || monthInput.equals("2")) {
			month = 2;
		} else if (monthInput.equalsIgnoreCase("March") || monthInput.equalsIgnoreCase("Mar.") || monthInput.equalsIgnoreCase("Mar") || monthInput.equals("3")) {
			month = 3;
		} else if (monthInput.equalsIgnoreCase("April") || monthInput.equalsIgnoreCase("Apr.") || monthInput.equalsIgnoreCase("Apr") || monthInput.equals("4")) {
			month = 4;
		} else if (monthInput.equalsIgnoreCase("May") || monthInput.equals("5")) {
			month = 5;
		} else if (monthInput.equalsIgnoreCase("June") || monthInput.equalsIgnoreCase("Jun") || monthInput.equals("6")) {
			month = 6;
		} else if (monthInput.equalsIgnoreCase("July") || monthInput.equalsIgnoreCase("Jul") || monthInput.equals("7")) {
			month = 7;
		} else if (monthInput.equalsIgnoreCase("August") || monthInput.equalsIgnoreCase("Aug.") || monthInput.equalsIgnoreCase("Aug") || monthInput.equals("8")) {
			month = 8;
		} else if (monthInput.equalsIgnoreCase("September") || monthInput.equalsIgnoreCase("Sept.") || monthInput.equalsIgnoreCase("Sep") || monthInput.equals("9")) {
			month = 9;
		} else if (monthInput.equalsIgnoreCase("October") || monthInput.equalsIgnoreCase("Oct.") || monthInput.equalsIgnoreCase("Oct") || monthInput.equals("10")) {
			month = 10;
		} else if (monthInput.equalsIgnoreCase("November") || monthInput.equalsIgnoreCase("Nov.") || monthInput.equalsIgnoreCase("Nov") || monthInput.equals("11")) {
			month = 11;
		} else if (monthInput.equalsIgnoreCase("December") || monthInput.equalsIgnoreCase("Dec.") || monthInput.equalsIgnoreCase("Dec") || monthInput.equals("12")) {
			month = 12;
		} else {
			System.out.println("Invalid month. Please re-enter.");
			return;
		}

		// Kiểm tra năm nhuận
		boolean isLeapYear = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
			    if (year % 400 == 0) {
				isLeapYear = true;
			    }
			} else {
			    isLeapYear = true;
			}
		}

		// Tính số ngày của tháng
		int numberOfDays;
		if (month == 2) {
			if (isLeapYear) {
			    numberOfDays = 29;
			} else {
			    numberOfDays = 28;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			numberOfDays = 30;
		} else {
			numberOfDays = 31;
		}

		// Hiển thị kết quả
		System.out.println("Number of days of " + monthInput + " " + year + " is: " + numberOfDays);
	}
}
