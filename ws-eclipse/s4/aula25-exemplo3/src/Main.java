import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2 * h;
		
		System.out.printf("A �rea do trap�zio � %.2f", area);
		// A �rea do trap�zio � 35.00

	}

}
