package vetores;

import java.util.Scanner;

public class MediaVetor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 10;
		int a[] = new int[TAM],  i;
		double soma = 0, media;

		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
			a[i] = in.nextInt();

			soma += a[i];
		}
		media = soma / TAM;

		System.out.println("A média dos valores é: " + media);

	}

}
