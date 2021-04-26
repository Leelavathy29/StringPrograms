package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class StringSwapping {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String");
		String inputString = scan.nextLine();

		char[] charArray = inputString.toCharArray();

		for (int i = 0; i < charArray.length - 1; i += 2) {
						
			for (int j = i + 1; j <= i + 1; j++ ) {
				System.out.println("Char array i" + charArray[i]);
				System.out.println("Char array j" + charArray[j]);
				char temp = charArray[i];
				charArray[i] = charArray[j];
				charArray[j] = temp;
			}
			
			/*
			 * char temp = charArray[i];
			 * charArray[i] = charArray[i+1];
			 * charArray[i+1] = temp;
			 */
			
			System.out.println("Temp :: " + Arrays.toString(charArray));
		}
		System.out.println("Char Array :: " + Arrays.toString(charArray));

	}
}
