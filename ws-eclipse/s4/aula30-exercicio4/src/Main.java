import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero
		// de horas trabalhadas, o valor que recebe por hora e calcula o
		// sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio
		// do funcion�rio, com duas casas decimais.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valor, salario;
		
		System.out.print("Digite o n�mero do funcionario: ");
		numero = sc.nextInt();
		System.out.print("Digite o n�mero de horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.print("Digite o valor por hora: ");
		valor = sc.nextDouble();
		salario = valor * horas;
		System.out.printf("O n�mero do funcionario � %d\n", numero);
		System.out.printf("O sal�rio � %.2f\n", salario);
		
		

	}

}
