package p1_Estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 *Fazer um programa para ler o c�digo de uma pe�a 1, o
 *n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
 *c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor
 *unit�rio de cada pe�a 2. Calcule e mostre o valor 
 *a ser pago
 */

public class Aula28_exercicio5 {

	public static void main(String[] args) {
		
		int numPeca1, numPeca2;
		double valorPeca1, valorPeca2, total;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite o n�mero de pe�as 1:");
		numPeca1 = sc.nextInt();
		System.out.println("Digite o valor da pe�a 1:");
		valorPeca1 = sc.nextDouble();
		System.out.println("Digite o n�mero de pe�as 2:");
		numPeca2 = sc.nextInt();
		System.out.println("Digite o valor da pe�a 2:");
		valorPeca2 = sc.nextDouble();
		total = numPeca1 * valorPeca1 + numPeca2 * valorPeca2;
		System.out.printf("O Valor a pagar: R$ %.2f\n", total);

		sc.close();
	}

}
