package week1.day2;

public class CountOfACharacter {

	public static void main(String[] args) {
		String name = "MerryChristmas";
		char toFind = 'm';
		int repetition = 0;
		char[] charNameArray = name.toCharArray();
		
		for (int i = 0; i < charNameArray.length; i++) {
			if(toFind == charNameArray[i]) {
				repetition++;
			}
			
		}
		System.out.println(toFind + " is repeated " + repetition + " times!!");

	}

}
