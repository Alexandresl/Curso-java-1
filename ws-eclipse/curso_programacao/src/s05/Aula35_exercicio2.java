package s05;

import java.util.Scanner;

/**
 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par
 * ou �mpar.
 */

public class Aula35_exercicio2 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("�mpar");
		}
		
		sc.close();

	}

}
