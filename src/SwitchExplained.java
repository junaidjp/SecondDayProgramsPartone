//Mostly used when Enums are involved

public class SwitchExplained {
	
	enum Cars { toyota, nissan, honda }

	public static void main(String args[])
	{
		SwitchExplained junaidObject=new SwitchExplained();

		checkCarInfo(Cars.honda);
		
		junaidObject.checkWeek("monday");
		
	}

	private  static void  checkCarInfo(Cars carType) {
		
		switch(carType)
		{
		
		case toyota :
			showToyotaModels();
			break;
		case nissan :
			showNissanModels();
			break;
		case honda : 
			showHondaModels();
			break; // Remove Break and Analyse the behaviour
			default:
				System.out.println("We are done displaying the car Models");
		}
		
		
	}

	
	
	public void checkWeek(String day) {
		switch (day) {

		case "monday":
			mondayprint();
			break;
		case "tuesday":
			tuesday();
			break;
		case "wednesday":
			wednesday();
			break; // Remove Break and Analyse the behaviour
		default:
			System.out.println("We are done displaying the car Models");
		}
	}
		
		
		
		public void checkWeekif(String day) {
			if(day.equals("monday")) {
				
			}
			else if(day.equals("tuesday")) { 
				
			}
			else if(day.equals("wednesday")) { 
				
			}
			else { 
				System.out.println("We are done displaying the car Models");
			}
		
		}
	private void wednesday() {
		// TODO Auto-generated method stub
		
	}

	private void tuesday() {
		// TODO Auto-generated method stub
		
	}

	private void mondayprint() {
		System.out.println("We work till 6:00");
		
	}

	private static void showHondaModels() {
		System.out.println("Honda Civic");
		System.out.println("Honda accord ");
		System.out.println("Honda Odyssey");
		
	}

	private static  void showToyotaModels() {
		System.out.println("Toyota Camry");
		System.out.println("Toyota Solara");
		System.out.println("Toyota Corrella");
		
	}

	private static  void showNissanModels() {
		System.out.println("Nissan Maxima");
		System.out.println("Nissan Altima");
		System.out.println("Nissan 350Z");
		

		
	}

	

	
	
	
}
