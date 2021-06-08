import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Um posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia
		// de seus clientes. Escreva um algoritmo para ler o tipo de combust�veis abastecido
		// codificando da segujinte forma: 1. �lcool 2. Gasolina 3. Diesel 4. Fim. Caso o usu�rio
		// informe um c�digo inv�lido (fora da faixa 1 a 4) deve ser solicitado um novo c�digo
		// (at� que seja v�lido. O programa ser� encerrado quando o c�digo informado for o n�mero
		// 4. Deve ser escrito a mensagem: "Muito Obrigado" e a quantidade de clientes que abasteceram
		// cada tipo de combust�vel, conforme exemplo.
		
		Scanner sc = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		menu();
		int menu = sc.nextInt();
		
		while (menu != 4) {
			if (menu == 1) {
				alcool++;
			} else if (menu == 2) {
				gasolina++;
			} else if (menu == 3) {
				diesel++;
			} else {
				System.out.println("Inv�lido. Digite novamente.");
			}
			
			menu();
			menu = sc.nextInt();
		}
		
		System.out.printf("Muito obrigado\n�lcool: %d\nGasolina: %d\ndiesel: %d\n", alcool, gasolina, diesel);

		
		sc.close();
	}
	
	public static void menu() {
		System.out.print("Digite o tipo de combust�vel:\n" +
						"1. �lcool\n" +
						"2. Gasolina\n" +
						"3. Diesel\n" +
						"4. Fim\n");		
	}

}
