import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros
		 * e mostre a divis�o do primeiro pelo segundo. Se o denominador for
		 * igual a zero, mostrar a mensagem "Divis�so imposs�vel".
		 * 
		 * Exemplo:
		 * Entrada	|	Sa�da
		 * 3		|	-1.5
		 * 3 -2		|	Divis�o imposs�vel
		 * -8 0		|	0.0
		 * 0 8		|
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int numerador = sc.nextInt();
			int denominador = sc.nextInt();
			
			if (denominador == 0) {
				System.out.println("Divis�o imposs�vel");
			} else {
				double diferenca = (double) numerador / denominador;
				System.out.printf("%.1f\n", diferenca);
			}
		}
		
		sc.close();

	}

}
