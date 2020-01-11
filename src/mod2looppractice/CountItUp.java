package mod2looppractice;

import java.util.Scanner;

public class CountItUp {

	public static void main(String[] args) {
		/*
		 * Count it up. Ask the user for a number. Display a count from 0 up to the
		 * number in your output.
		 * 
		 * Example
		 * 
		 * Enter a number: 8
		 * 
		 * 0 1 2 3 4 5 6 7 8 I just counted to 8!
		 */

		System.out.println("Enter a number");
		// Scanner input = new Scanner(System.in);
		// int userNumber = input.nextInt();

		int userNumber = getUserNumber();
		// int counter = 0;

//        while(counter <= userNumber) { 
//			System.out.print(counter + " ");
//			counter++;
//		}
		countMyNumbers(userNumber);
				
		System.out.println("");
		System.out.println("I just counted to " + userNumber);

		// input.close();
	}

	public static int getUserNumber() {
		Scanner input = new Scanner(System.in);
		int userNumber = input.nextInt();
		input.close();
		return userNumber;
	}

	public static void countMyNumbers(int userNumber) {

		int counter = 0;
		while (counter <= userNumber) {
			System.out.print(counter + " ");
			counter++;
		}

	}
}
