package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Year:");
		int year = in.nextInt();
		boolean isLeapyear = false;
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ;
		System.out.print(isLeapYear);
	}
	

}











