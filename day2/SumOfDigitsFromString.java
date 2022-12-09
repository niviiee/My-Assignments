package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String name = "Ama3z8n";
		char convert[] = name.toCharArray();
		int n = convert.length;
		System.out.println("Length Of String is : " + n);
		int sum = 0;
		char [] num = new char[30];
		int[] nums = new int[30];
		for (int i=0; i<n; i++) {
			if(Character.isDigit(convert[i]))
			{
				num[i]=convert[i];
				System.out.println(num[i]);
				nums[i]=Character.getNumericValue(num[i]);
				sum=sum+nums[i];
			}
		}
		System.out.println("The Sum Of Digits in given String is : " + sum);
	}

}
