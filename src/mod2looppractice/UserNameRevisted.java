package mod2looppractice;

import java.util.Scanner;

public class UserNameRevisted {

	public static void main(String[] args) {
		/*
		 * User Name revisited Ask the user for a user name of at least 4 characters in
		 * length. Continue prompting the user until they actually enter a user name
		 * that is long enough. Examples Enter a user name: bob not long enough! try
		 * again! bob still not long enough! try again!!!!
		 *
		 * bobby Welcome bobby!
		 */

		String userName = getUserName();

	}

	private static String getUserName() {
		System.out.println("Please enter a username that is at least 4 characters long");

		String userName = "";
		Scanner input = new Scanner(System.in);

		while (true) {   // true instead of repeating userName = input.nextLine();

			userName = input.nextLine();
			if (userName.length() < 4) {
				System.out.println("Must be at least 4 letters long.");
			} else { 
				break;
			}
		}
		
		System.out.println("you're good");
		
		input.close();
		return userName;
	}

}
