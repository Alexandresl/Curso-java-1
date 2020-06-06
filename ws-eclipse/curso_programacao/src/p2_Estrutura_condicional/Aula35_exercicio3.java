package p2_Estrutura_condicional;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar
 * uma mensagem "s�o m�ltiplos" ou "N�o s�o m�ltiplos", indicando
 * se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros
 * devem poder ser digitados em ordem crescente ou decrescente.
 */

public class Aula35_exercicio3 {
	
	public static void main(String[] args) {
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 n�meros inteiros");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("S�o m�ltiplos");
		} else {
			System.out.println("N�o s�o m�ltiplos");
		}
		
		sc.close();
		
	}
	
}
