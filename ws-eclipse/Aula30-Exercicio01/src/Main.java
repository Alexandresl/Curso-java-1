import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa para ler dois valores inteiros e depois mostar na
		 * tela a soma desses n�meros com uma mensagem explicativa, conforme
		 * exemplos.
		 * */
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.print("Digite um inteiro: ");
		x = sc.nextInt();
		System.out.print("Digite outro inteiro: ");
		y = sc.nextInt();
		System.out.println("A soma �: " + (x + y));
		
		sc.close();

	}

}
