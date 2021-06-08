import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Escreva um programa que repita a leitura de uma senha
		// at� que ela seja v�lida. Para cada leitura de senha
		// incorreta informada, escrever a mensagem "Senha  inv�lida".
		// Quando a senha for informada corretamente deve ser impressa 
		// a mensagem "Acesso permitido" e o algoritmo encerrado.
		// Considere que a senha correta � o valor 2002.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha (apenas n�meros): ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.print("Senha inv�lida. Tente novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();

	}

}
