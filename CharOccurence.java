package week1.day2;

public class CharOccurence {
	public static void main(String[] args) {
		String text = "Welcome to world";
		int count=0;
		char[] charArray = text.toCharArray();
		int length = text.length();
		for (int i = 0; i < length; i++) {
			if (charArray[i] == 'o') {
				count++;
			}
		}
	
		System.out.println(count);
	}

}
