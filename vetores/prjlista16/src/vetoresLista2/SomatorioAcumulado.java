package vetoresLista2;

import java.util.Scanner;

public class SomatorioAcumulado {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 10;
		int i, j, a[] = new int[TAM], b[] = new int[TAM];

		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor:");
			a[i] = in.nextInt();
		}

		for (i = 0; i < TAM; i++) {
			for (j = i; j < TAM; j++) {
				b[i] = b[i] + a[j];
			}
			System.out.println("B[" + i + "] = soma de A[" + i + "] até A[" + (TAM - 1) + "] = " + b[i]);
		}


	}

}
