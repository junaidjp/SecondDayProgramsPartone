//Under Nesting if - It  will help you 
public class NestedIf {


	public static void main(String args[])
	{
		int numToyotaCars = 5;
		int numNissanCars = 10;
		int numHondaCars = 1;
		int totalCars=12;
				
		if(numToyotaCars < numNissanCars)
		{
			if(totalCars > 15){
				System.out.println("We  need to sell more cars");
			}
			System.out.println("We have more Toyota cars than Nisaan cars");
		}
		
		else if(numNissanCars>numToyotaCars)
		{
			System.out.println("We have more nissan cars than Toyota cars");
			
		}
		System.out.println("We have "+numHondaCars  + " HondaCars");
	}

	
	
}
