import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Um posto de combust�veis deseja determinar qual de seus produtos tem
		 * a prefer�ncia de seus clientes. Escreva um altoritmo para ler o tipo 
		 * de combust�vel abastecido (codific ado da seguinte forma: 1 - �lcool,
		 * 2 - Gasolina, 3 - Diesel e 4 - Fim). Caso o usu�rio iunforme um 
		 * c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo
		 * c�digo (at� que seja v�lido). O programa ser encerrado quando o 
		 * c�digo informado for o n�mero 4. Deve ser escrito a mensagem: 
		 * "Muito Obrigado" e a quantidade de clientes que abasteceram cada
		 * tipo de combust�vel, conforme o exemplo.
		 * 
		 * Exemplo
		 * Entrada	|	Sa�da
		 * 8		|	Muito Obrigado
		 * 1		|	�lcool: 1
		 * 7		|	Gasolina: 2
		 * 2		|	Diesel: 0
		 * 2		|
		 * 4		|
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int combustivel = 0;
		int qtdAlcool = 0;
		int qtdGasolina = 0;
		int qtdDiesel = 0;
		
		combustivel = sc.nextInt();
		
		while (combustivel != 4) {
			if (combustivel == 1) {
				qtdAlcool++;
			} else if (combustivel == 2) {
				qtdGasolina++;
			} else if (combustivel == 3) {
				qtdDiesel++;
			}
			combustivel = sc.nextInt();
		}
		
		System.out.println("Muito obrigado");
		System.out.println("�lcool: " + qtdAlcool);
		System.out.println("Gasolina: " + qtdGasolina);
		System.out.println("Diesel: " + qtdDiesel);
		
		sc.close();

	}

}
