package StringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String");
		String inputString = scan.nextLine();

		String[] strArray = inputString.split(" ");
		String reversedString = "";

		for (int i = 0; i < strArray.length; i++) {
			System.out.println("Reversed String in Loop  :: " + reversedString);
			System.out.println("Str Array " + strArray[i]);
			reversedString =  strArray[i] + reversedString;
		}

		System.out.print("Reversed string : " + reversedString);

	}

}
