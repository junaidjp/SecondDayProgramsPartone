//The do while loop is much the same as the while loop, except
//for the fact that the continuation condition is checked at the end of the loop

public class DoWhile {
	
	public static void main(String[] args) {
		int limit = 20; // Sum from 1 to this value
		int sum = 0; // Accumulate sum in this variable
		int i = 1; // Loop counter
		// Loop from 1 to the value of limit, adding 1 each cycle
		do {
		sum += i; // Add the current value of i to sum
		i++;
		System.out.println("Value of i is now is "+i);
		} while(i <= limit);
		System.out.println("sum = "+ sum);
		}

}
