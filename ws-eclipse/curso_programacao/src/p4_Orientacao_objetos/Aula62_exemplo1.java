package p4_Orientacao_objetos;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler as medidas dos lados de dois tri�ngulos 
 * X e Y (suponha medidas v�lidas). Em seguida, mostrar o valor das
 * �reas dos dois tri�ngulos e dizer qual dos dois tri�ngulos possui
 * a maior �rea.
 * A formula para calcular a �rea de um tri�ngulo a partir das medidas
 * de seus lados a, b e c � a seguinte (f�rmula de Heron):
 * 
 * area = sqrt(p(p-a)(p-b)(p-c)) onde p = (a+b+c) / 2
 */

public class Aula62_exemplo1 {

	public static void main(String[] args) {
		
		// Resolu��o sem orienta��o a objetos
		
		double xA, xB, xC, yA, yB, yC, areaX, areaY, pX, pY;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as medidas do tri�ngulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Digite as medidas do tri�ngulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		pX = (xA + xB + xC) / 2;
		areaX = Math.sqrt(pX * (pX-xA) * (pX-xB) * (pX-xC));
		
		pY = (yA + yB + yC) / 2;
		areaY = Math.sqrt(pY * (pY-yA) * (pY-yB) * (pY-yC));
		
		System.out.printf("A �rea do trin�ngulo X � %.4f\n", areaX);
		System.out.printf("A �rea do trin�ngulo Y � %.4f\n", areaY);
		if (areaX > areaY) {
			System.out.println("A maior �rea � X");
		} else {
			System.out.println("A maior �rea � Y");
		}
		sc.close();

	}

}
