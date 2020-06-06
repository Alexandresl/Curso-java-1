package p3_Estruturas_repetitivas;

import java.util.Scanner;

/**
 * Um posto de combust�veis deseja determinar qual de seus 
 * produtos tem a prefer�ncia de seus clientes. Escreva um
 * algoritmo para ler o tipo de combust�vel abastecido 
 * (codificado da seguinte forma: 1. �lcool 2. Gasolina
 * 3. Diesel 4. Fim). Caso o usu�rio informe um c�digo 
 * inv�lido (fora da faixa de 1 a 4) deve ser solicitado 
 * um novo c�digo (at� que seja v�lido). O programa ser�
 * encerrado quando o c�digo informado for o n�mero 4.
 * Deve ser escrito a mensagem "MUITO OBRIGADO" e a
 * quantidade de clientes que abasteceram cada tipo 
 * de combust�vel.
 */

public class Aula47_exercicio3 {

	public static void main(String[] args) {
		
		int produto = 0, alcool = 0, gasolina = 0, diesel = 0;
		Scanner sc = new Scanner(System.in);
		
		while (produto != 4) {
			
			System.out.println("Digite o produto:");
			produto = sc.nextInt();
			
			if (produto == 1) {
				alcool++;
			} else if (produto == 2) {
				gasolina++;
			} else if (produto == 3) {
				diesel++;
			} else if (produto == 4) {
				System.out.println("MUITO OBRIGADO");
				System.out.println("�lcool: " + alcool);
				System.out.println("Gasolina: " + gasolina);
				System.out.println("Diesel: " + diesel);
			}
			
		}
		
		sc.close();

	}

}
