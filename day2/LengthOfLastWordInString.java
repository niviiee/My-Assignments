package week1.day2;

public class LengthOfLastWordInString {

	public static void main(String[] args) {
		String input = new String("Take me to a Hillstation  ");

		System.out.println(input);
		String inputArray[] = input.strip().split(" ");
		String lastword = "";
		
		for(int i=0;i<inputArray.length;i++) {
			lastword = inputArray[i];
		}
		System.out.println("Last word for the given input is : \'" + lastword + "\'");
		System.out.println("Length of the last word for the given input is : " + lastword.length());
	}

}
