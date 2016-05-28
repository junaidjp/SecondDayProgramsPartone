
public class IfConditionExplained {

	
	public static void main(String args[])
	{
		int toyotaCars=10;
		int nissanCars=20;
		int hondaCars=30;
		
		int totalCars=toyotaCars+nissanCars+hondaCars;
		
		
		//if(some codtion)
		if(toyotaCars>10) {
			System.out.println("We have more than 10 toyota Cars");
			System.out.println("Sell them fast");
		}
		else if(nissanCars<10)
		{
			System.out.println("We have less Nisaan cars");
			System.out.println("Go to Dealer get more Nissan");
		}
		else if(hondaCars>=30)
		{
			System.out.println("We have excess hondaCars");
			System.out.println("We need to have a Honda Sale");
			
		}
		if(totalCars>50)
		{
			System.out.println("My sales men are ding a pathetic job ");
			System.out.println("Fire a Sale man");
		}
		
		
		if(toyotaCars < 12)
			System.out.println("Toyota is selling fast");
				
		else  
			System.out.println("just print something");
		
		
			
		
		}
}
