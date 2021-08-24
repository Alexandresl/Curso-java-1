import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Fa�a um programa para ler o valor do raio do c�rculo, e depois
		 *  mostrar o valor da �rea deste c�rculo com quatro casas decimais
		 *  conforme exemplos.
		 *  
		 *  F�rmula da �rea: area = pi * raio�
		 *  
		 *  considere o valor de pi = 3.14159
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi;
		pi = 3.14159;
		
		System.out.print("Digite o raio do c�rculo: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A �rea do c�rculo � %.4f\n", area);
		
		sc.close();
		
	}

}
