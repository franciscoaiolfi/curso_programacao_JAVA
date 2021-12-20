package exercises01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		Double raio1 = sc.nextDouble();
		Double area = 3.14159 * (raio1 * raio1);
		System.out.printf("O valor da area e de: " +("%.4f%n"), area);
		
	
		sc.close();
	}

}
