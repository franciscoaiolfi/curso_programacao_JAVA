package exerciseFour;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int hora;
		System.out.println("Que horas sao: ");
		hora = sc.nextInt();
		if (hora <= 12) {
			System.out.println("Bom dia Francisco!");
		} else {
			if (hora <= 18) {
				System.out.println("Boa tarde Francisco");
			} else {
				System.out.println("Boa noite Francisco");
			}
		}

		sc.close();
	}

}
