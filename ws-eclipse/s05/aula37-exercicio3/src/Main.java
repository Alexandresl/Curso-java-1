import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar
		// uma mensagem "S�o m�ltiplos" ou "N�o s�o m�ltiplos", indicando se
		// os valores lidos s�o m�ltiplos entre si. Aten��o: os valores devem
		// poder ser digitados em ordem crescente ou decrescente.
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 2 inteiros:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 < n2) {
			if (n2 % n1 == 0) {
				System.out.printf("%d � m�ltiplo de %d", n2, n1);
			} else {
				System.out.printf("%d n�o � m�ltiplo de %d", n2, n1);
			}
		} else {
			if (n1 % n2 == 0) {
				System.out.printf("%d � m�ltiplo de %d", n1, n2);
			} else {
				System.out.printf("%d n�o � m�ltiplo de %d", n1, n2);
			}
		}
		
		sc .close();

	}

}
