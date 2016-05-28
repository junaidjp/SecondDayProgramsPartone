//Understand Logical Operators Exach statement
public class LogicalOperatorsExplained {


	public static void main(String args[])
	{
		int numToyotaCars = 5;
		int numNissanCars = 13;
		int numHondaCars = 10;
		int totalCars=16;
		//		5          13                5 			10
		if((numToyotaCars>numNissanCars) || ( numToyotaCars<numHondaCars))
		{
			if(totalCars>15){
				System.out.println("We  need to sell more cars");
			}
			System.out.println("We have less Toyota cars than Nisaan cars OR HondaCars");
		}
		     // 13              5               13 			10
		 if(numNissanCars < numToyotaCars && numNissanCars>numHondaCars)
		{
			System.out.println("We have more nissan cars than Toyota cars AND HondaCars");
			
		}
		    //10 
		if(numHondaCars>=11){
		System.out.println("We have "+numHondaCars  + " HondaCars");}
		   //  10
		if(!(numHondaCars>=11)){ //Negate Operators
			
			
			System.out.println("We have less than 11 Honda cars in Inventory");
		}
	}

	
}
