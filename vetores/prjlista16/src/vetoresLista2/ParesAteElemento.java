package vetoresLista2;

import java.util.Scanner;

public class ParesAteElemento {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 10;
		int i, a[] = new int[TAM], seq;

		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor:");
			a[i] = in.nextInt();

		}

		for (i = 0; i < TAM; i++) {
			System.out.println("\nSequencia de pares até o número " + a[i]);
			for (seq = 0; seq <= a[i]; seq += 2) {
				System.out.print(seq + " ");
			}
			System.out.println();
		}
	}

}
