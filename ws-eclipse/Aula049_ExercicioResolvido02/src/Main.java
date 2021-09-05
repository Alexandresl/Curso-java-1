import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa para ler um n�mero indeterminado de dados, contendo
		 * cada um, a idade de um indiv�duo. O �ltimo dado, que n�o entrar� nos
		 * c�lculos, cont�m um valor de idade negativa. Calcular e imprimir a
		 * idade m�dia deste grupo de indiv�duos. Se for entrado um valor 
		 * negativo na primeira vez, mostrar a mensagem "Imposs�vel Calcular".
		 * 
		 *  Entrada	|	Sa�da
		 *  31		|	34.67
		 *  27		|
		 *  46		|
		 *  -5
		 *  
		 *  Entrada	|	Sa�da
		 *  -10		|	Imposs�vel Calcular
		 */
		
		Scanner sc = new Scanner(System.in);
		int idade, contador, soma;
		double media;
		
		contador = 0;
		soma = 0;
		idade = sc.nextInt();
		
		if (idade >= 0) {
			while (idade >= 0) {
				contador += 1;
				soma += idade;
				idade = sc.nextInt();
			}
			media = (double) soma / contador;
			System.out.printf("%.2f\n", media);
		} else {
			System.out.println("Imposs�vel Calcular");
		}
		
		sc.close();
	}

}
