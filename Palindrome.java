package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str = "ANNA";
		String str2 = "";
		for (int i = str.length()-1; i>=0; i--) {
			str2 = str2 + str.charAt(i);
		}
		System.out.println(str2);
		if (str.equals(str2)) {
			System.out.println("Given string is a Palindrome");
		} else {
			System.out.println("Given string is not a Palindrome");

		}
	}
}
