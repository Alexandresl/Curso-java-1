import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa que l� n�meros inteiros at�
		// at� que um zero seja lido. Ao final mostrar
		// a soma dos n�meros lidos.
		
		Scanner sc = new Scanner(System.in);
		int Soma = 0;
		System.out.println("Digite um n�mero inteiro: ");
		int num = sc.nextInt();
		
		while (num != 0) {
			Soma += num;
			System.out.println("Digite outro inteiro: ");
			num = sc.nextInt();
		}
		
		System.out.println(Soma);
		sc.close();

	}

}
