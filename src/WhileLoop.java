import java.math.BigInteger;

//Understand while because this you will use a lot 
public class WhileLoop {
	
	
	public static void main(String[] args) {
		int limit = 20; // Sum from 1 to this value
		int sum = 0; // Accumulate sum in this variable
		int i = 1; // Loop counter
		// Loop from 1 to the value of limit, adding 1 each cycle
		while (i <= limit) {
			sum += i++; // Add the current value of i to sum
			System.out.println("sum =" + sum);
			System.out.println("Value of i is now " + i);
			System.out.println("--------------------");
		}
		System.out.println("finally ssum = " + sum);
		
		
	}
}


