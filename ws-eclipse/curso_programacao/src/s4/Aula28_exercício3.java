package s4;

import java.util.Scanner;

/**
 *Fazer um programa para ler quatro valores inteiros A, B, C e D.
 *A seguir, calcule e mostre a diferen�a do produto de A e B pelo
 *produto de C e D segundo a f�rmula: Diferen�a = (A * B - C * D).
 */

public class Aula28_exerc�cio3 {

	public static void main(String[] args) {
		
		int A, B, C, D, diferenca;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quatro valores inteiros:");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		diferenca = A * B - C * D;
		System.out.printf("Diferen�a = %d", diferenca);
		
		sc.close();
	}
	
}
