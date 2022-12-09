package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] textArray = text.split(" ");
		int count = 0;
		System.out.println(textArray);
		
		for(int i=0; i < textArray.length-1;i++) {
			for(int j=i+1; j < textArray.length;j++) {
				System.out.println(textArray[i]);
				System.out.println(textArray[j]);
				if(textArray[i].equals(textArray[j])) {
					count++;
				}
			}
			System.out.println(count);
			if(count>1) {
				text = text.replace(textArray[i], "");
				count = 0;
			}
				
		}
		System.out.println("Input text without duplicates : " + text);
	}

}
