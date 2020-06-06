package p3_Estruturas_repetitivas;

import java.util.Scanner;

/**
 * Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:
 * 1 x N = N  2 X N = 2N  10 X N = 10N
 * 
 * Entrada:
 * A entrada cont�m um valor inteiro N (2 < N < 1000)
 * 
 * Sa�da:
 * Imprima a tabuada de N, conforme o exemplo fornecido
 */

public class Aula52_exerc�cioResolvido1 {

	public static void main(String[] args) {
		
		int num, res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		num = sc.nextInt();
		
		for (int i = 1; i <=10; i++) {
			res = i * num;
			System.out.printf("%d x %d = %d\n", i, num, res);
		}
		
		sc.close();

	}

}
