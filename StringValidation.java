package Interview;

import java.util.Scanner;

public class StringValidation {

	// boolean isValid = false;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your input string");
		String inputString = scan.nextLine();

		StringValidation validation = new StringValidation();
		boolean isValid = validation.calculateStringValidation(inputString);
		String validStatement = isValid ? "Valid" : "Invalid";
		System.out.println("String is " + validStatement);
	}

	public boolean calculateStringValidation(String inputString) {

		int strlength = inputString.length();
		// inputString.toCharArray();
		if (inputString.startsWith("+") || inputString.startsWith("-") || inputString.startsWith("*")
				|| inputString.startsWith("/") || inputString.startsWith(")")) {
			return false;
		} else {
			for (int i = 0; i < strlength; i++) {
				System.out.println((int) inputString.charAt(i)); // 97-122-0-9
				int stringIntegerValue = (int) inputString.charAt(i);
				System.out.println(" i " + inputString.charAt(i));
				if ((stringIntegerValue >= 97) && (stringIntegerValue <= 122)
						|| (stringIntegerValue >= 48 && stringIntegerValue <= 57)) {
					{
						for (int j = 0; j <= i; j++) {
							System.out.println(" j " + inputString.charAt(j));
							if (inputString.charAt(j) == '+' || inputString.charAt(j) == '-'
									|| inputString.charAt(j) == '*' || inputString.charAt(j) == '/'
									|| ((stringIntegerValue >= 97) && (stringIntegerValue <= 122))
									|| ((stringIntegerValue >= 48 && stringIntegerValue <= 57))) {
								continue;
							} else {
								return false;
							}
						}
					}
				}
			}
			return true;
		}
	}
}
