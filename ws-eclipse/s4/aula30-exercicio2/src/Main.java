import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		
		System.out.print("Digite o raio de um c�rculo: ");
		double raio = sc.nextDouble();
		double area = PI * Math.pow(raio, 2);
		System.out.printf("A �rea do C�rculo � %.4f\n", area);
		sc.close();

	}

}
