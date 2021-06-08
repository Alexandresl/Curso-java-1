import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fa�a um programa para ler um n�mero indeterminado de dados,
		// contendo cada um, a idade de um indiv�duo. O �ltimo dado,
		// que n�o entrar� nos c�lculos, cont�m um valor de idade negativa.
		// Calcular e imprimir a idade m�dia deste grupo de indiv�duos. Se
		// for entrado um valor negativo na primeira vez, mostrar a mensagem
		// "Imposs�vel calcular"
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a lista das idades:");
		int idade = sc.nextInt();
		int contador = 0, soma = 0;

		while (idade >= 0) {
			contador++;
			soma += idade;
			idade = sc.nextInt();
		}
		
		if (contador == 0) {
			System.out.println("Imposs�vel calcular");
		} else {
			double media = (double) soma / contador;
			System.out.printf("A m�dia � %.2f", media);
		}
		sc.close();

	}

}
