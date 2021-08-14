package week1.day2;

public class MyMobile {
	    // variables
	    // Instance variable
	    // we are inside the class - variable and methods inside the class, outside the main
	int screensize = 10;
	int cost;
	char logo;
	float amps;
	long mobilenumber;
	boolean isTouchScreen;
	String brandName;
	
	public void makecalls() {
		System.out.println("Making Calls");
		
	}
	public void takepics() {
		System.out.println("Take Pics"); 
			
		}
	private void paymoney() {
		System.out.println("Pay Money");
	}
	
	    // main()
	    // Instance creation
	
	public static void main(String[] args) {
		// access the class variable and methods 
		// create object initiate 
		
		// syntax
		// className objName = New constructure
		
		MyMobile mobobj = new MyMobile();
		mobobj.takepics();
		mobobj.paymoney();
		mobobj.makecalls();
		
		// mobobj. but if we have to assign the varialble this step should be followed
		// ctrl+2; press L
		// or 
		// ctrl+1 choose local variable assigned
		
		int screensize2 = mobobj.screensize;
		System.out.println("Screensize: " + screensize2);
	
	}
}
