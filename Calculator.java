package week1.day2;

public class Calculator {
	
	public void add (int a,int b,int c) {
		int d= a+b+c;
		System.out.println("Add value is: " + d);
}
	public void sub (int a,int b) {
		int c= a-b;
		System.out.println("Subtract value is: " + c);
}
	public void mul (int a,int b) {
		int c= a*b;
		System.out.println("Multiply value is: " + c);
}
	public void div (int a,int b) {
		int c= a/b;
		System.out.println("Division value is: " + c);
}
	public static void main(String[] args) {
		Calculator valuesobj = new Calculator();
		valuesobj.add(10, 20, 30);
		valuesobj.sub(10, 20);
		valuesobj.mul(10, 20);
		valuesobj.div(10, 20);
	}
}
