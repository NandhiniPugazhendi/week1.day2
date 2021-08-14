package week1.day2;

import java.util.Arrays;
import java.util.Collections;

public class FindLargestElementArray {

	public static void main(String[] args) {
		//Intialize the array
		int [] arrNum = {123,25,40,6,250,4,89};
		//step 1. sort the array
		//arrays.sort select int []
		Arrays.sort(arrNum);
		// step 2. find the largest element in the array
		System.out.println("Largest element in the array " + arrNum[arrNum.length-1]);
		
		//find the second largest element
		System.out.println("Second largest element in the array " + arrNum[arrNum.length-2]);
		
		//find the second lowest element
		System.out.println("Second lowest element in the array " + arrNum[arrNum.length-6]);
		
	}
	
} 
