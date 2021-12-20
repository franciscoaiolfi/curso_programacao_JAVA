package funcoesMatematicas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valor 1: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite valor 2: ");
		int valor2 = sc.nextInt();
		int soma = (valor1 + valor1);
		System.out.println("Valor total: " + soma);
		
		
		sc.close();
	}

}
