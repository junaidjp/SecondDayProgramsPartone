//Enumaration explained
public class EnumerationExplained {
	
	enum Day {Monday, Tuesday, Wednesday, Thursday,
		Friday, Saturday, Sunday }
	
	
	enum Month { Jan,Feb , March, April,May }
	
	enum CreditCard { VISA , MASTERCARD, AMERICAN_EXPRESS , DISCOVER } 
	
	
		public static void main(String[] args) {
		// Define three variables of type Day
		
			
	CreditCard	AMEX_CARD = CreditCard.AMERICAN_EXPRESS;	
	
	System.out.println(AMEX_CARD);
			
		Month currentMonth = Month.Jan;	
		System.out.println(currentMonth);
		
		
		Month monthofMay = Month.May;
		
		Day	 today = Day.Friday;
		Day yesterday = Day.Saturday;
		//Day today = Day.Sunday;
		Day tomorrow = Day.Monday;
		// Output the values of the Day variables
		System.out.println("Today is "+ today);
		System.out.println("Tomorrow will be " + tomorrow);
		System.out.println("Yesterday was " + yesterday);
		
		}
		}


