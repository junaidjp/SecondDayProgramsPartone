// One 
public class Scoping {
	
	public static int outer = 10;
	
	public static void main(String[] args) {
	
	int outer = 1; // Exists throughout the method
	//String outer="name";
	// You cannot refer to a variable before its declaration
	System.out.println("outer variable values is  " +outer);
	int inner = 2;
	//outer=5;
	System.out.println("inner = " + inner); // Uncomment this for an error
	showscope();
	{
	inner=3;
	System.out.println("inner = " + inner); // Now it is OK
	System.out.println("outer = " + outer); // and outer is still here
	// All variables defined in the enclosing outer block still exist,
	// so you cannot redefine them here
	outer = 5; // Uncomment this for an error
	}
	
	}
	
	
	public static void showscope() { 
		System.out.println("outer variable values is " +outer);
	}
	}

