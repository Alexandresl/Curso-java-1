package s14.Aula128_exercicio1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import s14.Aula128_exercicio1.entities.Employee;
import s14.Aula128_exercicio1.entities.OutsourcedEmployee;

/**
 * Uma empresa possui funcion�rios pr�prios e terceirizados.
 * Para cada funcion�rio, deseja-se registrar nome, horas
 * trabalhadas e valor por hora. Funcion�rios terceirizados
 * possuem ainda uma despesa adicional.
 * 
 * O pagamento dos funcion�rios corresponde ao valor da hora
 * multiplicado pelas horas trabalhadas, sendo que os
 * funcion�rios terceirizados ainda recebem um b�nus
 * correspondente a 110% de sua despesa adicional.
 * 
 * Fazer um programa para ler os dados de N funcion�rios (N
 * fornecido pelo usu�rio) e armazena-los em uma lista. Depois
 * de ler todos os dados, mostrar nome e pagamento de cada
 * funcion�rio na mesma ordem em que foram digitados.
 * 
 * Construa o programa conforme projeto ao lado. Veja
 * exemplo na pr�xima p�gina.
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number os employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (outsourced == 'n') {
				employees.add(new Employee(name, hours, valuePerHour));
			} else {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			
		}
		
		System.out.println();
		System.out.println("Payments:");
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		sc.close();

	}

}
