package vetores;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		final int TAM = 10;
		int a[] = new int[TAM], b[] = new int[TAM], c[] = new int[TAM], i;

		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
			a[i] = in.nextInt();
		}

		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor B");
			b[i] = in.nextInt();

			c[i] = a[i] + b[i];
		}

		for (i = 0; i < TAM; i++) {
			System.out.print(c[i] + " ");
		}

	}

}
