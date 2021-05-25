import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Leia 3 valores de ponto flutuante e efetue o
		// c�lculo das ra�zes da equa��o de Bhaskara.
		// Se n�o for poss�vel calcular as ra�zes,
		// mostre a mensagem correspondente "imposs�vel
		// calcular", caso haja uma divis�o por 0 ou raiz
		// de n�mero negativo.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 n�meros: ");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double delta = Math.pow(B, 2) - 4.0 * A * C;
		
		if (delta <= 0.0 || A == 0.0) {
			System.out.println("Imposs�vel calcular");
		} else {
			double r1 = (-B + Math.sqrt(delta)) / (2 * A);
			double r2 = (-B - Math.sqrt(delta)) / (2 * A);
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
		}
		
		sc.close();

	}

}
