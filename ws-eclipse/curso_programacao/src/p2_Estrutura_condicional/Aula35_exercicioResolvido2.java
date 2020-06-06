package p2_Estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/**
 *  Problema do site URI
 *  https://www.urionlinejudge.com.br/judge/pt/problems/view/1036
 *  
 *  Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes
 *  da equa��o de Bhaskara. Se n�o for poss�vel calcular as ra�zes,
 *  mostre a mensagem correspondente "imposs�vel calcular", caso haja
 *  uma divis�o por 0 ou raiz de n�mero negativo.
 *  
 *  Entrada:
 *  Leia tr�s valores de ponto flutuante (double) A, B e C
 *  
 *  Sa�da:
 *  Se n�o houver possibilidade de calcular as ra�zes, apresente a
 *  mensagem "Imposs�vel calcular". Caso contr�rio, imprima o resultado
 *  das ra�zes com 5 d�gitos ap�s o ponto, com uma mensagem correspondente
 *  conforme exemplo abaixo. Imprima sempre o final da linha ap�s cada
 *  mensagem.
 */

public class Aula35_exercicioResolvido2 {

	public static void main(String[] args) {

		double A, B, C, delta, r1, r2;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros com ponto flutuante");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		delta = Math.pow(B, 2) - 4.0 * A * C;
		
		if (delta < 0 || A == 0) {
			System.out.println("Imposs�vel calcular");
		} else {
			r1 = (-B + Math.sqrt(delta)) / (2.0 * A); 
			r2 = (-B - Math.sqrt(delta)) / (2.0 * A);
			System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1, r2);
		}

		sc.close();
	}

}
