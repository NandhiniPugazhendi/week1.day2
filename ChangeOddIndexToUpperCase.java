package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String name = "tamilnadu";
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i % 2 != 0) {
				char name1 = charArray[i];
				name1 = Character.toUpperCase(name1);
				System.out.println("Change Odd Index to Upeer case: " + name1);
				
				
			}
			
		}
		
	}
}
