package p1_Estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 *Fazer um programa que leia o n�mero de um funcion�rio, seu
 *n�mero de horas trabalhadas, o valor que recebe por hora e
 *calcula o sal�rio desse funcion�rio. A seguir, mostre o 
 *n�mero e o sal�rio do funcion�rio, com duas casas decimais
 */

public class Aula28_exercicio4 {
	public static void main(String[] args) {
		int numFuncionario, horasTrabalhadas;
		double valor, salario;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero do funcion�rio:");
		numFuncionario = sc.nextInt();
		System.out.println("Digite o n�mero de horas trabalhadas:");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o valor que recebe por hora:");
		valor = sc.nextDouble();
		salario = valor * horasTrabalhadas;
		System.out.printf("N�mero: %d\nSal�rio: R$ %.2f\n", numFuncionario, salario);
		
		sc.close();
	}
}
