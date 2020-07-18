package s10.Aula88_exemplo1.application;

import java.util.Locale;
import java.util.Scanner;

import s10.Aula88_exemplo1.entities.Product;

/**
 * Fazer um programa para ler um n�mero inteiro N
 * e os dados (nome e pre�o) de N produtos. Armazene
 * os N produtos em um vetor. Em seguida, mostrar o
 * pre�o m�dio dos produtos.
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0.00;
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			sum += price;
		}
		
		double avg = sum / n;
		System.out.printf("AVERAGE PRICE = %.2f", avg);
		
		sc.close();

	}

}