package s6;

import java.util.Scanner;

/**
 * Testar se o sexto bit de um n�mero inteiro
 * � verdadeiro ou falso utilizando os operadores
 * bitwise
 */

public class Aula56_exemplo2 {
	public static void main(String[] args) {
		int mascara = 0b100000;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um inteiro: ");
		int n = sc.nextInt();
		if ((n & mascara) != 0) {
			System.out.println("O sexto bit � verdadeiro!");
		} else {
			System.out.println("O sexto bit � falso!");
		}
		sc.close();
	}
}
