
//Under If conditions because you will use them a lot 

public class ComparingOperators {

	
	
	public static void main(String args[])
	{
		int numToyotaCars = 5;
		int numNissanCars = 10;
		int numHondaCars = 1;
		int totalCars=0;
		
		if(numToyotaCars > numNissanCars)
		{
			System.out.println("We have more Toyota cars than Nisaan cars");
		}
		if(numNissanCars > numToyotaCars)
		{
			System.out.println("We have more nissan cars than Toyota cars");
			
		}
		System.out.println("We have "+numHondaCars  + " HondaCars");
	}
}
