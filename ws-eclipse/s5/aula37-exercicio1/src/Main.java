import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Fazer um programa para ler um n�mero inteiro, e depois
		// dizer se este n�mero � negativo ou n�o
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("N�mero negativo.");
		} else {
			System.out.println("N�mero n�o negativo.");
		}
		
		sc.close();

	}

}
