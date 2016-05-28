
//Under If conditions because you will use them a lot 
//Explain why there is a different ouput than the last program

public class ComparingOperators2 {

	
	
	public static void main(String args[])
	{
		int numToyotaCars = 5;
		int numNissanCars = 10;
		int numHondaCars = 1;
				
		if(numToyotaCars<numNissanCars)
		{
			System.out.println("We have more Toyota cars than Nisaan cars");
		}
		else if(numNissanCars>numToyotaCars)
		{
			System.out.println("We have more nissan cars than Toyota cars");
			
		}
		System.out.println("We have "+numHondaCars  + " HondaCars");
	}
}
