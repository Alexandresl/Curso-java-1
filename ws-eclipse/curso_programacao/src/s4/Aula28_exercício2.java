package s4;

import java.util.Locale;
import java.util.Scanner;

/**
 *Fa�a um programa para ler o valor do raio de um c�rculo, e 
 *depois mostrar o valor da �rea deste c�rculo com quatro
 *casas decimais conforme exemplos.
 *F�rmula da �rea: area = pi . raio^2
 *Considere o valor do pi = 3.14159
 */

public class Aula28_exerc�cio2 {

	public static void main(String[] args) {
		
		double raio, area, pi = 3.14159;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do c�rculo:");
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		System.out.printf("�rea = %.4f", area);
		
		sc.close();
		
	}
	
}
