package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String input = "racecar";
		String reversedInput = "";
		char[] inputCharArray = input.toCharArray();

		for(int i=inputCharArray.length-1; i>=0; i--) {
			reversedInput += inputCharArray[i];
		}

		if(input.equalsIgnoreCase(reversedInput)) {
			System.out.println("String \'" + input + "\' is a Palindrome");
		}else {
			System.out.println("String " + input + " is not a Palindrome");
		}

	}

}
