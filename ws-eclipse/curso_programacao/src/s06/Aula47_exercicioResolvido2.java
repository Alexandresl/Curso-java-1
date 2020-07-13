package s06;

import java.util.Scanner;

/**
 * Fa�a um programa para ler um n�mero indeterminado de dados,
 * contendo cada um, a idade de um indiv�duo. O �ltimo dado, que
 * n�o entrar� nos c�lculos, cont�m um valor de idade negativa.
 * Calcular e imprimir a idade m�dia deste grupo de indiv�duos.
 * Se for entrado um valor negativo na primeira vez, mostrar
 * a mensagem "imposs�vel calcular!
 */

public class Aula47_exercicioResolvido2 {

	public static void main(String[] args) {

		int idade, contador = 0, soma = 0;
		double media = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma idade:");
		idade = sc.nextInt();
		
		if (idade >= 0) {
			
			while (idade >= 0) {
				contador++;
				soma += idade;
				System.out.println("Digite outra idade:");
				idade = sc.nextInt();
			}
			
			media = (double) soma / contador;
			System.out.printf("m�dia das idades � %.2f\n", media);
			
		} else {
			System.out.println("Imposs�vel calcular");
		}
		
		sc.close();

	}

}
