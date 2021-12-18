package scanners;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Associate the scanner object with the keyboard on the console
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
			System.out.println(s3);
			System.out.println(s2);
			System.out.println(s3);
		
		
		
		
		sc.close();
	}

}
