import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de
		 * horas trabalhadas, o valor que recebe por hora e calcula o sal�rio
		 * desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do
		 * funcion�rio, com duas casas decimais
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numFuncionario, numHorasTrabalhadas;
		double valorPorHora, salario;
		
		System.out.print("Digite o n�mero do funcion�rio: ");
		numFuncionario = sc.nextInt();
		System.out.print("Digite o n�mero de horas trabalhadas: ");
		numHorasTrabalhadas = sc.nextInt();
		System.out.print("Digite o valor por hora: ");
		valorPorHora = sc.nextDouble();
		
		salario = numHorasTrabalhadas * valorPorHora;
		
		System.out.printf("O n�mero do funcion�rio � %d\nSeu sal�rio � $ %.2f", numFuncionario, salario);
		
		sc.close();

	}

}
