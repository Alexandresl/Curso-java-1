package s10.Aula94_exercicio1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import s10.Aula94_exercicio1.entities.Emplyoee;

/**
 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e
 * salario) de N funcion�rios. N�o deve haver repeti��o de id.
 * 
 * Em seguida, efetuar o aumento de x por cento no salario de um determinado
 * funcion�rio. Para isso, o programa deve ler um id e o valor x. Se o id
 * informado n�o existir, mostrar uma mensagem e abortar a opera��o. Ao final,
 * mostrar a listagem atualizada dos funcion�rios, conforme exemplos.
 * 
 * Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o
 * sal�rio possa ser mudado livremente. Um sal�rio s� pode ser aumentado com
 * base em uma opera��o de aumento por porcentagem dada.
 */

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Emplyoee> list = new ArrayList<Emplyoee>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {

			System.out.println("Emplyoee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			list.add(new Emplyoee(id, name, salary));
			System.out.println();

		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		for (int i = 0; i < n; i++) {

			boolean index = list.get(i).getId() == id;
			
			if (index) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				
				list.get(i).increaseSalary(percentage);	
			} else {
				System.out.println("This id does not exist!");
				break;
			}

		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Emplyoee x : list) {
			System.out.println(x);
		}

		sc.close();

	}

}