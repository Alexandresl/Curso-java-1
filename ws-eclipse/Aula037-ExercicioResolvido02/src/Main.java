import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * Leia 3 valores de ponto flutuantd e efetue o c�lculo das ra�zes da 
		 * equa��o de Bhaskara. Se n�o for poss�vel calcular as ra�zes, mostre
		 * a mensagem correspondente "imposs�vel calcular", caso haja um divis�o
		 * por zero (0) ou raiz de n�mero negativo.
		 * 
		 * Entradas:
		 * Leia tr�s valores de ponto flutuante (double) A, B e C.
		 * 
		 * Sa�das:
		 * Se n�o houver possibilidade de calcular as ra�zes, apresente a
		 * mensagem "Imposs�vel calcular". Caso contr�rio, imprima o resultado 
		 * das ra�zes com 5 d�gitos ap�s o ponto, com uma mensagem 
		 * correspondente conforme exemplos. imprima sempre o final de linha
		 * ap�s cada mensagem.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, delta, raiz1, raiz2;
		
		System.out.print("Digite tr�s valores de ponto flutuante: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		delta = Math.pow(B, 2) - (4 * A * C);
		
		if (A != 0 && delta >= 0) {
			
			raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
			raiz2 = (-B - Math.sqrt(delta)) / (2 * A);
			
			System.out.printf("R1 �: %.5f\n", raiz1);
			System.out.printf("R2 �: %.5f\n", raiz2);
			
		} else {
			System.out.println("Imposs�vel calcular");
		}
		
		sc.close();
		
	}
}
