import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa que repita a leitura de uma senha at� que ela
		 * seja v�lida. Para cada leitura de senha incorreta informada,
		 * escrever a mensagem "Senha inv�lida". Quando a senha for informada
		 * corretamente deve ser impressa a mensagem "Acesso Permitido" e o 
		 * algoritmo encerrado. Considere que a senha correta � o valor 2002.
		 * 
		 * Exemplo:
		 * Entrada	|	Sa�da
		 * 2200		|	Senha inv�lida
		 * 1020		| 	Senha inv�lida
		 * 2022		|'	Senha inv�lida
		 * 2002		|	Acesso Permitido
		 */
		
		Scanner sc = new Scanner(System.in);
		int senhaCorreta = 2002;
		
		int senha = sc.nextInt();
		
		while (senha != senhaCorreta) {
			System.out.println("Senha inv�lida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
