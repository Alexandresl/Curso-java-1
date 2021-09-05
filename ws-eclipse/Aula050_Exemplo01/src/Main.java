import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa que l� um valor inteiro N e depois N n�meros inteiros.
		 * Ao final, mostra a soma dos N n�meros lidos.
		 * 
		 * Exemplo:
		 * Entrada	|	Sa�da
		 * 3		|	11
		 * 5		|
		 * 2		|
		 * 4		|
		 */

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int soma = 0;
		int qtd = sc.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			num = sc.nextInt();
			soma += num;
		}
		
		System.out.println(soma);
		
		
		sc.close();
		
	}

}
