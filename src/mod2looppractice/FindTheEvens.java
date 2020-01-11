package mod2looppractice;

import java.util.Scanner;

public class FindTheEvens {

	public static void main(String[] args) {
		/*
		 * Find the evens Ask the user for a number. Display all the even numbers from 0
		 * to that number and also keep track of the number of evens you found. Hint:
		 * you may need to google how to find an even number in Java.
		 *
		 * Example: Enter a number: 8
		 * 
		 * 2 4 6 8 I just found 4 even numbers!
		 *
		 */

		System.out.println("Enter a number");

		int userNumber = getUserNumber();
		int evenCounter = findEvens(userNumber);

		System.out.println("");
		System.out.println("I just found " + evenCounter + " even numbers.");

	}

	// methods

	public static int getUserNumber() {
		Scanner input = new Scanner(System.in);
		int userNumber = input.nextInt();
		input.close();
		return userNumber;
	}

//	public static void countMyNumbers(int userNumber) {
//
//		int counter = 0;
//		while (counter <= userNumber) {
//			// System.out.print(counter + " ");
//			counter++;
//		}

	public static int findEvens(int userNumber) {
		int counter = 0;
		int evenCounter = 0;

		while (counter <= userNumber) {

			counter++;
			if (counter % 2 == 0) {
				System.out.print(counter + " ");
				evenCounter++;
			}
		}
		return evenCounter;
	}

}
