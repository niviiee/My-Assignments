package week1.day2;

public class Palindrome2 {
	public boolean isPalindrome(String input) {
		boolean flag = true;
		if(input == " ") {
			return flag;
		}else{
			input = input.replaceAll("[^a-zA-z]", "");
			char[] inputArray = input.toCharArray();
			String inputReverse="";
			for(int i=inputArray.length-1; i>=0;i--) {
				inputReverse += inputArray[i];
			}
			if (input.equalsIgnoreCase(inputReverse)){
				flag = true;
			}else flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {

		String input = "A man, a plan, a canal: Panama";
		Palindrome2 pal = new Palindrome2();
		if (pal.isPalindrome(input)) {
			System.out.println("String \'" + input + "\' is a palindrome!");
		}else {
			System.out.println("String \'" + input + "\' is not a palindrome!");
		}

	}

}
