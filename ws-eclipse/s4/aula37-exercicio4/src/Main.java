import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule
		// a dura��o do jogo, sabendo que o mesmo pode come�ar em um dia e
		// terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de
		// 24 horas.
		Scanner sc = new Scanner(System.in);
		int duracao;
		System.out.println("Digite a hora inicial e final:");
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = (24 - horaInicial) + horaFinal;
		}

		System.out.printf("O jogo durou %d horas", duracao);
		
		sc.close();
		
	}

}
