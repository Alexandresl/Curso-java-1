import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// Calcula a �rea de um trap�zio de base (menor) 6, base (maior) 8 e altura 5.
		// Formula: area = ((b + B) / 2) * h
		
		Locale.setDefault(Locale.US);
		
		double b = 6.0, B = 8.0, h = 5.0, area;
		
		area = (b + B) / 2 * h;
		System.out.printf("A �rea do trap�zio � %.2f", area);

	}

}
