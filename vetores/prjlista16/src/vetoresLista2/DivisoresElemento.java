package vetoresLista2;

import java.util.Scanner;

public class DivisoresElemento {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 10;
		int i, div, a[] = new int[TAM];

		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor:");
			a[i] = in.nextInt();
		}

		for (i = 0; i < TAM; i++) {
			System.out.println("\nDivisores de " + a[i]);
			for (div = 1; div <= a[i] / 2; div++) {
				if (a[i] % div == 0) {
					System.out.print(div + " ");
				}
			}
			System.out.print(a[i]);
			System.out.println();
		}

	}

}
