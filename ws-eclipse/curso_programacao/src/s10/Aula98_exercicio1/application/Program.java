package s10.Aula98_exercicio1.application;

import java.util.Scanner;

/**
 * Fazer um programa para ler dois n�meros inteiros M e N,
 * e depois ler uma matriz de M linhas e N colunas contendo
 * n�meros inteiros, podendo haver repeti�es. Em seguida, ler
 * um n�mero inteiro X que pertence � matriz. Para cada ocorr�ncia
 * de X, mostrar os valores � esquerda, acima, � direita e abaixo
 * de X, quando houver, conforme exemplo.
 */

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		Integer[][] matriz = new Integer[m][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (find(i, j, x, matriz)) {
					System.out.println("Position " + i + ", " + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (j < m - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("Top: " + matriz[i - 1][j]);
					}
					if (i < m - 1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
			}
		}
		
		sc.close();

	}
	
	public static boolean find(int i, int j, int x, Integer[][] matriz) {
		return matriz[i][j] == x ? true : false;
	}

}