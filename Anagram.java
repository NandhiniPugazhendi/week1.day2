package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String name = "long";
		String name1 = "short";
		char[] charArray = name.toCharArray();
		char[] charArray2 = name1.toCharArray();
		boolean flag = true;
		int n = name.length();
		int n1 = name1.length();
		if (n == n1) {
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			for (int i = 0; i < charArray2.length; i++) {
				if (charArray[i] != charArray2[i])
					flag = false;
					break;				
				}
				}
		    if (flag) {
				System.out.println("Two string are Anagram");
			} else {
				System.out.println("Two string are not Anagram");

			}
			}
			
		}
		

