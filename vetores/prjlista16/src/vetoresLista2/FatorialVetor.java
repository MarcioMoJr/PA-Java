package vetoresLista2;

import java.util.Scanner;

public class FatorialVetor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 15;
		int i, fat, a[] = new int[TAM];
		long b[] = new long[TAM];

		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor:");
			a[i] = in.nextInt();

			b[i] = 1;
			for (fat = 1; fat <= a[i]; fat++) {
				b[i] = b[i] * fat;
			}
		}

		for (i = 0; i < TAM; i++) {
			System.out.println(a[i] + "! = " + b[i]);
		}

	}

}
