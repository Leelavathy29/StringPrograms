package StringPrograms;

public class DuplicateOccurences {

	public static void main(String[] args) {

		String givenInputString = "Leela is a Leela one there is to a Leela";
		String[] stringArray = givenInputString.split(" ");
		
		String[] wordArray = new String[stringArray.length];
		
		
		
		
		/*
		 * for(int i = 0; i < stringArray.length - 1; i++) {
		 * 
		 * for(int j = i + 1; j < stringArray.length; j++) {
		 * 
		 * 
		 * if(wordArray[i].equals(wordArray[j])) { System.out.println(wordArray[i]); }
		 * 
		 * }
		 * 
		 * }
		 * 
		 */
		
		
		
		for (int i = 0; i < stringArray.length ; i++) {
			int strOccurence = 0;
			for (int j = 0 ; j < stringArray.length ; j++) {
				String str1 = stringArray[i].toLowerCase();
				String str2 = stringArray[j].toLowerCase();

				if (str1.equals(str2)) {
					//System.out.println("i value " + i);
					//System.out.println("j value " + j);
					
					strOccurence++;
				} 
			}
			
			
			if (strOccurence >= 2) {
				System.out.println(stringArray[i] + "  Occured  : " + strOccurence + " times ");
			}
		}

	}

}
