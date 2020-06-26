package p4_Orientacao_objetos.Aula64_exemplo1.application;

import java.util.Locale;
import java.util.Scanner;
import p4_Orientacao_objetos.Aula64_exemplo1.entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as medidas do tri�ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do tri�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
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
