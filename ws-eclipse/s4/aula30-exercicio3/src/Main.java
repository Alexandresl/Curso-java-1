import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		// calcule e mostre a diferen�a do produto de A e B pelo produto de C e D
		// segundo a f�rmula: DIFEREN�A = (A * B - C * D).
		
		Scanner sc = new Scanner(System.in);
		int A, B, C, D;
		System.out.print("Digite 4 n�meros inteiros: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		int resultado = A * B - C * D;
		System.out.printf("(%d * %d) - (%d * %d) = %d", A, B, C, D, resultado);
		sc.close();

	}

}
