import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero �
		 * par ou �mpar
		 */
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um inteiro: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("N�mero par");
		} else {
			System.out.println("N�mero �mpar");
		}
		
		sc.close();

	}

}
