package s06;

import java.util.Scanner;

/**
 * Fazer um programa que l� n�meros inteiros at� que
 * um zero seja lido. Ao final mostra a soma dos
 * n�meros lidos.
 * 
 * ------------------------------
 * | 	Entrada 	| 	Sa�da 	|
 * ------------------------------
 * | 	5 			| 	11 		|
 * | 	2 			| 	  		|
 * | 	4 			| 	   		|
 * | 	0 			| 	   		|
 * ------------------------------
 */

public class Aula43_exe1 {

	public static void main(String[] args) {
		
		int num, total = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro");
		num = sc.nextInt();
		
		while (num != 0) {
			total += num;
			System.out.println("Digite um n�mero inteiro");
			num = sc.nextInt();
		}
		
		System.out.println("O valor total � " + total);
		
		sc.close();

	}

}
