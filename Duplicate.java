package week1.day2;

public class Duplicate {

	public static void main(String[] args) {
		int dup [] = {1,2,5,3,6,3,4};
		
		for (int i = 0; i < dup.length; i++) {
			for (int j = i+1; j < dup.length; j++) {
			
				if (dup[i]==dup[j]) {
					System.out.println("Found Duplicates in Array is: " + dup[i]);
				}
			}
		}

	}
}
