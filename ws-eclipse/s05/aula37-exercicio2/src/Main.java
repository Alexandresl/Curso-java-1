import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Fazer um programa para ler um n�mero inteiro e dizer
		// se este n�mero � par ou impar.

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("O n�mero %d � par.", num);
		} else {
			System.out.printf("O n�mero %d � �mpar", num);
		}
		
	}

}
