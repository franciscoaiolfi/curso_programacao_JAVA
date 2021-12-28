package exerciseIfandElse02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int number;
		
		System.out.println("Digite um valor: ");
		number = sc.nextInt();
			if(number > 0) {
				System.out.println("O valor digitado é positivo!");
			}
			else {
				System.out.println("O valor digitado é negativo");
			}
	sc.close();
	}

}
