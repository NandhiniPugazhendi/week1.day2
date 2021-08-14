package week1.day2;

public class Intersection {

	public static void main(String[] args) {
		int [] array1 = {0,1,2,5,9,3,6,8};
		int [] array2 = {5,6,2,8,4,3,0,7};
		System.out.println("The intersection of two arraya are: ");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println("Array1: " + array1[i]);
					System.out.println("Array2: " + array2[j]);
					
				}
			}
			
		}
		
	}
}
