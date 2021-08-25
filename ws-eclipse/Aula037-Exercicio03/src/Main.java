import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma 
		 * mensagem "S�o m�ltiplos" ou "N�o s�o m�ltiplos", indicando se os
		 * os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem
		 * poder ser digitados em ordem crescente ou decrescente.
		 */
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Digite 2 inteiros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("S�o m�ltiplos");
		} else {
			System.out.println("N�o s�o m�ltiplos");
		}
		
		sc.close();

	}

}
