import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler tr�s n�mero inteiros. Em seguida, mostrar
		 * qual o menor dentre os tr�s n�meros lidos. Em caso de empate, mostrar
		 * apenas uma vez.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("Digite 3 n�mero inteiros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if (n1 < n2 && n1 < n3) {
			System.out.println("O menor n�mero �: " + n1);
		} else if (n2 < n3) {
			System.out.println("O menor n�mero �: " + n2);
		} else {
			System.out.println("O menor n�mero �: " + n3);
		}
				
		sc.close();

	}

}
