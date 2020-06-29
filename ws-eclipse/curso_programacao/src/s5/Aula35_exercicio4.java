package s5;

import java.util.Scanner;

/**
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule
 * a dura��o do jogo, sabendo que o mesmo pode come�ar em um dia
 * e terminar em outro, tendo uma dura��o m�nima de 1 hora e
 * m�xima de 24 horas.
 */

public class Aula35_exercicio4 {

	public static void main(String[] args) {
		
		int horaInicial, horaFinal, duracao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial e final de um jogo:");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial >= horaFinal) {
			horaFinal += 24;
		}
		
		duracao = horaFinal - horaInicial;
		
		System.out.println("O jogo durou " + duracao + " hora(s)");
	
		sc.close();

	}

}
