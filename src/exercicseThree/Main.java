package exercicseThree;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor de A: ");
		int A = sc.nextInt();
	System.out.println("Digite o valor de B: ");
		int B = sc.nextInt();
	System.out.println("Digite o valor de C: ");
		int C = sc.nextInt();
	System.out.println("Digite o valor de D: ");
		int D = sc.nextInt();
		int result = (A * B - C * D);
	System.out.println("A difiren�a real de valores � de: " + result);
		
	
		
	
sc.close();
	}

}
