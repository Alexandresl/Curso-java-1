package p2_Estrutura_condicional;

// Demonstra��o de uma express�o condicional tern�ria

public class Aula38_exe1 {

	public static void main(String[] args) {
		
		double preco = 34.5;
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("Valor do desconto: %.2f", desconto);
		
		
	}

}
