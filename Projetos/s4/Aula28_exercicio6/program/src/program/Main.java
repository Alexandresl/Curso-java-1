package program;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
 * mostre:
 * a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
 * b) a �rea do c�rculo de raio C. (pi = 3.14159)
 * c) a �rea do trap�zio que tem A e B por bases e C por altura.
 * d) a �rea do quadrado que tem lado B.
 * e) a �rea do ret�ngulo que tem lados A e B
 */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double pi = 3.14159;
		
		double triangle = a * c / 2;
		double circle = pi * Math.pow(c, 2);
		double trapeze = (a + b) * c / 2;
		double square = Math.pow(b, 2);
		double rectangle = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", triangle);
		System.out.printf("CIRCULO: %.3f\n", circle);
		System.out.printf("TRAPEZIO: %.3f\n", trapeze);
		System.out.printf("QUADRADO: %.3f\n", square);
		System.out.printf("RETANGULO: %.3f\n", rectangle);
		
		sc.close();

	}

}
