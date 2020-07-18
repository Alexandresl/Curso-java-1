package s10.Aula94_exercicio1_correcao.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import s10.Aula94_exercicio1_correcao.Entities.Employee;

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
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("Id already taken! try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idEmployee = sc.nextInt();
		
		Employee result = list.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);
		
		//Integer pos = position(list, idEmployee);
		
		if (result == null) {
			
			System.out.println("This id does not exist!");
			
		} else {
			
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			
			//list.get(pos).increaseSalary(percent);
			result.increaseSalary(percent);
			
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
		
	}
	
	public static Integer position(List<Employee> list, int id) {
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		
		return null;
		
	}
	
	public static Boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}