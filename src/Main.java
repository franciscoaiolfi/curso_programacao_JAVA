import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	 
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 3586;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 2500.00;
		double measure = 33.5326;
		
	System.out.println("Products: ");
	System.out.println(product1 + ", which price is R$ " + price1);
	System.out.println(product2 + ", which price is R$ " + price2);
	
	System.out.print("Record: ");
	System.out.println( age + " years old ," + "code " + code + " and " + gender + ": ");
	
	System.out.println("Measue with eigth decimal places: " + measure);
	System.out.printf("Rouded (three decimal places):" + ("%.3f%n"), measure);
	Locale.setDefault(Locale.US);
	System.out.printf("US decimal point: " + ("%.3f%n"), measure);
	
		
		
		
		

	}

}
