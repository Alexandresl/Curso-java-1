import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um n�mero inteiro positivo N. O programa deve
		 * ent�o mostrar na tela N linhas, come�ando de 1 at� N. Para cada linha
		 * mostrar o n�mero de linhas, depois o quadrado e o cubo do valor,
		 * conforme exemplo
		 * 
		 * Exemplo
		 * Entrada	|	Sa�da
		 * 5		|	1 1 1
		 * 			|	2 4 8
		 * 			|	3 9 27
		 * 			|	4 16 64
		 * 			|	5 25 125
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d\n", i, i * i, i * i * i);
		}
		
		sc.close();

	}

}
