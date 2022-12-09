package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String name = "I work at Amazon"; 
		String input[]=name.split(" ");
		for (int i=0; i<input.length; i++)
			System.out.println(input[i]);
		for(int i=0; i<input.length; i++) {
			if(i%2!=0 && input[i].length() > 1) {
				char[] eachWord = input[i].toCharArray();
				String reversedWord = "";
				for(int j1=eachWord.length-1; j1>=0; j1--) 
				{
					reversedWord += eachWord[j1];
				}
				System.out.println(reversedWord +" ");
			}
			else
			{
				System.out.print(input[i] + " ");
			}
		}

	}

}
