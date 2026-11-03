package vetoresLista2;

import java.util.Scanner;

public class VetorPalindromo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 10;
		int i, a[] = new int[TAM];
		boolean palindromo = true;

		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
			a[i] = in.nextInt();
		}

		for (i = 0; i < TAM / 2; i++) {
			if (a[i] != a[TAM - 1 - i]) {
				palindromo = false;
			}
		}

		System.out.println("\nVetor A:");
		for (i = 0; i < TAM; i++) {
			System.out.print(a[i] + " ");
		}

		if (palindromo) {
			System.out.println("\nO vetor A é um palíndromo");
		} else {
			System.out.println("\nO vetor A não é um palíndromo");
		}

	}

}