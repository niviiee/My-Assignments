package week1.day2;

public class Digits {

	public static void main(String[] args) {
		String name = "Amazon Chennai has 15300 employees";
		String replaceAll = name.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
	}

}
