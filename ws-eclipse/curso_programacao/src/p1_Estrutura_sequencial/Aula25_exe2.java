package p1_Estrutura_sequencial;

import java.util.Scanner;

public class Aula25_exe2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x; // declaramos um int
		String s1, s2, s3;

		x = sc.nextInt(); // x recebe o valor do inteiro digitado
		sc.nextLine(); // Comando para absorver a quebra de linha resultante da digita��o do inteiro
		s1 = sc.nextLine(); // s1 receber� a primeira frase
		s2 = sc.nextLine(); // s2 receber� a segunda frase
		s3 = sc.nextLine(); // s3 receber� a terceira frase

		System.out.println("Texto digitado:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}
}
