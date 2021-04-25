package StringPrograms;

import java.util.Scanner;

public class StringIgnoreCase {

	public static void main(String[] args) {

		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("Enter Input String"); String inputString =
		 * scan.nextLine();
		 * System.out.println("Enter String to be searched");
		 * String matchString = scan.nextLine();
		 */

		String inputString = "This is java program";

		String matchString = "prOGrAm";

		inputString = inputString.toUpperCase();

		matchString = matchString.toUpperCase();

		if (inputString.contains(matchString)) {
			
			System.out.println("String is Present");
			
		} else {
			
			System.out.println("String Not Present");
			
		}

	}

}
