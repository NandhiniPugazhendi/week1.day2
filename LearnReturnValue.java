package week1.day2;

public class LearnReturnValue {

	public int add() {
		int a = 10;
		int b = 5;
		int c = a+b;
		return c;	
	}
	
	public void sub (int a,int b) {
		int c= a-b;
		System.out.println("subtract value is: " + c);
	}
	public static void main(String[] args) {
		LearnReturnValue obj = new LearnReturnValue();
		int result = obj.add();
		System.out.println("result is: " + result);
		obj.sub(result, 5);
	}
}
