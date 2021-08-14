package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int [] arrNum = {0,1,2,3,5,6,7,8};
		//sort the array
		Arrays.sort(arrNum);	
		for (int i = 0; i < arrNum.length; i++) {
        if (arrNum[i] != i) {
			System.out.println("Missing Elament is: " + i);
			break;
		}
			
		}
	}
}
