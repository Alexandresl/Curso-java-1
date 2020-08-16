package program;

import java.util.Locale;
import java.util.Scanner;

/**
 * Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes da equa��o de Bhaskara.
 * Se n�o for poss�vel calcular as ra�zes, mostre a mensagem correspondente "Imposs�vel calcular",
 * caso haja uma divis�o por 0 ou raiz de n�mero negativo.
 * 
 * Entrada:
 * Leia tr�s valores de ponto flutuante (double) A, B e C.
 * 
 * Sa�da:
 * Se n�o houver possibilidade de calcular as ra�zes, apresente a mensagem "Imposs�vel Calcular".
 * Caso contr�rio, imprima o resultado das ra�zes com 5 d�gitos ap�s o ponto, com uma mensagem
 * correpsondente conforme exemplo abaixo. Imprima sempre o final dea linha ap�s cada mensagem.
 * 
 * Link do problema original: https://www.urionlinejudge.com.br/judge/pt/problems/view/1036
 * 
 * Exerc�cio resolvido em https://www.youtube.com/watch?v=3lhkB5I8P6E
 */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if (delta <= 0 || a == 0) {
			System.out.println("Imposs�vel calcular");
		} else {
			double r1 = (- b + Math.sqrt(delta)) / (2 * a);
			double r2 = (- b - Math.sqrt(delta)) / (2 * a);
			
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
				
		}
		
		sc.close();

	}

}
