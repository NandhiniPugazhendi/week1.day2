package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test="I am in my native";
		String[] test1 = test.split(" ");
		String value="";
		for(int i=0;i<test1.length;i++) {
			if(i%2==1) 
				value=value+new StringBuilder(test1[i]).reverse().toString()+" ";
			else
				value=value+test1[i]+" ";		
	}
		value=value + trim();
		System.out.println(value);
	}
	private static String trim() {
		return null;
	}
}
