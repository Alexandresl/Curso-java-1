package s4;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa que leia tr�s valores com ponto flutuante de 
 * dupla precis�o: A, B e C. Em seguida, calcule e mostre:
 * a) a �rea do tri�ngulo ret�ngulo que tem A por vase e C por altura
 * b) a �rea do c�rculo de raio C. (pi = 3.14159)
 * c) a �rea do trap�zio que tem A e B por bases e C por altura
 * d) a �rea do quadrado que tem lado B.
 * e) a �rea do ret�ngulo que tem lados A e B
 */

public class Aula28_exercicio6 {

	public static void main(String[] args) {
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros com ponto flutuante:");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		triangulo = A * C / 2;
		circulo = pi * Math.pow(C, 2);
		trapezio = (A + B) * C / 2;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		System.out.printf(
				"Tri�ngulo: %.3f\nC�rculo: %.3f\nTrap�zio: %.3f\nQuadrado: %.3f\nRet�ngulo: %.3f",
				triangulo,
				circulo,
				trapezio,
				quadrado,
				retangulo);
		sc.close();

	}

}
