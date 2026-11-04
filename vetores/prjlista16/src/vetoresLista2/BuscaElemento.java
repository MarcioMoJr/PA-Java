package vetoresLista2;

import java.util.Scanner;

public class BuscaElemento {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 10;
		int i, x, achou, a[] = new int[TAM];
		String resposta;

		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
			a[i] = in.nextInt();
		}

		do {
			System.out.println("\nDigite o valor que deseja procurar no vetor A:");
			x = in.nextInt();

			achou = 0;
			for (i = 0; i < TAM; i++) {
				if (x == a[i]) {
					System.out.println("O valor " + x + " existe no vetor A (posição A[" + i + "])");
					achou = 1;
				}
			}
			if (achou == 0) {
				System.out.println("O valor " + x + " não existe no vetor A");
			}
			System.out.println("\nDeseja procurar outro valor? S-Sim / N-Não");
			resposta = in.next();
		} while (resposta.equalsIgnoreCase("S"));
	}

}
