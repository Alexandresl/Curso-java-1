package s06;

import java.util.Scanner;

/**
 * Leia uma quantidade indeterminada de duplas de valores inteiros
 * X e Y. Escreva para cada X e Y uma mensagem que indique se estes
 * valores foram digitados em ordem crescente ou decrescente.
 * 
 * Entrada:
 * A entrada cont�m v�rios casos de teste. Cada caso cont�m dois 
 * valores inteiros X e Y. A leitura deve ser encerrada ao ser 
 * fornecido valores iguais para X e Y.
 * 
 * Sa�da:
 * Para cada caso de teste imprima "Crescente" caso os valores tenham
 * sido digitados na ordem crescente, caso contr�rio imprima a mensagem
 * "Decrescente".
 */

public class Aula47_exerc�cioResolvido1 {

	public static void main(String[] args) {
		
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois inteiros para X e Y:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			
			if (x < y) {
				System.out.println("Os n�meros foram digitados na ordem crescente!");
			} else {
				System.out.println("Os n�meros foram digitados na ordem decrescente!");
			}
			
			System.out.println("Digite dois inteiros para X e Y:");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
