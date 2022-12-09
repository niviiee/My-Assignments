package week1.day2;

import java.util.Arrays;

public class MissingArrayElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int n=0;
		for(int i=0; i<arr.length; i++)
		{
			if(i+1!=arr[i])
			{
				n=i+1;
				System.out.println("Missing Array Element is :" + n);
				break;
			}
			
		}
		

	}

}
