package s04;

import java.util.Locale;
import java.util.Scanner;

public class Aula24_exe5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Declara��o de tr�s vari�veis
		String x;
		int y;
		double z;
		// S�o realizadas as leituras em sequ�ncia:
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		// S�o impressos os dados
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();
		
	}

}
