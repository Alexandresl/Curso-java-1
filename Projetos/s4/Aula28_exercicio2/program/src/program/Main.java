package program;

import java.util.Locale;
import java.util.Scanner;



/**
 * Fa�a um programa para ler o valor do raio de um c�rculo, ,e depois mostrar o valor da �rea deste c�rculo com quatro
 * casas decimais, conforme exemplos.
 * Formula da �rea: area = pi . raio^2
 * considere o valor de pi = 3.14159
 */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new java.util.Scanner(System.in);
		double pi = 3.14159;
		
		
		double raio = sc.nextDouble();
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f\n", area);
		
		sc.close();
		

	}

}
