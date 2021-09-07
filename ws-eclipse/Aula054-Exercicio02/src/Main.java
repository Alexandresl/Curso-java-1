import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Leia um valor inteiro n. Este valor ser� a quantidade de valores inteiros
		 * x que ser�o lidos em seguida. Mostre quantos destes valores x est�o dentro
		 * do intervalor [10, 20] e quantos est�o fora do intervalor, mostrando estas
		 * informa��es conforme exemplo (use a palavra "in" para dentro do intervalor
		 * e "out" para fora do intervalor).
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 1; i <= n; i++) {
			int x = sc.nextInt();
			if (x >= 10 &&  x <= 20) {
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
