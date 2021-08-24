import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as
		 * 1, o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero
		 * de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o
		 * valor a ser pago.
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, numPeca1, numPeca2;
		double vlrPeca1, vlrPeca2, total;
		
		System.out.print("Digite o c�digo, a quantidade e o valor unit�rio de cada pe�a: ");
		cod1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		vlrPeca1 = sc.nextDouble();
		cod2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		vlrPeca2 = sc.nextDouble();
		
		total = numPeca1 * vlrPeca1 + numPeca2 * vlrPeca2;
		
		System.out.printf("O total a pagar � $ %.2f das pe�as de c�digos %d e %d.", total, cod1, cod2);
		sc.close();
	}

}
