package p2_Estrutura_condicional;

import java.util.Scanner;

/**
 * Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero
 * � negativo ou n�o.
 */

public class Aula35_exercicio1 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("N�o negativo");
		} else {
			System.out.println("Negativo");
		}
		
		sc.close();

	}

}
