package s06;

import java.util.Scanner;

/**
 * Leia um valor inteiro N. Este valor ser� a quantidade
 * de valores inteiros X que ser�o lidos em seguida.
 * Mostre quantos destes valores X est�o dentro do
 * intervalo [10,20] e quantos est�o fora do intervalo,
 * mostrando essas informa��es conforme exemplo (use a
 * palavra "in" para dentro do intervalo, e "out" para
 * fora do intervalo).
 */

public class Aula52_exe2 {

	public static void main(String[] args) {
		
		int n, x, out = 0, in = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de n�meros a ser lidos:");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Digite %d de %d:\n", i, n);
			x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
