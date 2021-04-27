package StringPrograms;


public class ReplaceStringOccurence {

	public static void main(String[] args) {

		String givenInputString = "One of the and most widely used "
				+ "Java is and used as Java the and most back-end development the projects ";

		String stringToGetReplaced = "and";

		String replaceWithString = "Spring";

		String[] strArray = givenInputString.split(" ");

		ReplaceStringOccurence replaceStringOccurence = new ReplaceStringOccurence();
		replaceStringOccurence.replaceThirdOccurence(givenInputString, stringToGetReplaced, replaceWithString,
				strArray);

	}

	public void replaceThirdOccurence(String givenInputString, String stringToGetReplaced, String replaceWithString,
			String[] strArray) {

		int strOccurence = 0;
		String finalString = "";
		System.out.println(stringToGetReplaced + "" + replaceWithString);

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equalsIgnoreCase(stringToGetReplaced)) {
				strOccurence++;
				if (strOccurence == 3) {
					strArray[i] = replaceWithString;
				}
			}

		}
		
		for(String str : strArray) {
			finalString += str + " ";
		}
		System.out.println("givenInputString after :: " + finalString);
	}

}
