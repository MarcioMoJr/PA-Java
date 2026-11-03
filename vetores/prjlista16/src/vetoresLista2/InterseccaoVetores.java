package vetoresLista2;

import java.util.Scanner;

public class InterseccaoVetores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 5;
		int i, j, qnt = 0, a[] = new int[TAM], b[] = new int[TAM], c[] = new int[TAM];

		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
			a[i] = in.nextInt();
		}
		
		System.out.println();
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor B");
			b[i] = in.nextInt();
		}

		for (i = 0; i < TAM; i++) {
			for (j = 0; j < TAM; j++) {
				if (a[i] == b[j]) {
					c[qnt] = a[i];
					qnt++;
				}
			}
		}

		System.out.println("\nVetor A:");
		for (i = 0; i < TAM; i++) {
		    System.out.print(a[i] + " ");
		}

		System.out.println("\nVetor B:");
		for (i = 0; i < TAM; i++) {
		    System.out.print(b[i] + " ");
		}
		
		System.out.println("\nVetor C:");
		for (i = 0; i < qnt; i++) {
		    System.out.print(c[i] + " ");
		}

	}

}
