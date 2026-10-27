package vetores;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int a[] = new int[TAM], b[] = new int[TAM], i;

		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
			a[i] = in.nextInt();
		}

		for (i = 0; i < TAM; i++) {
			b[i] = a[TAM - 1 - i];
		}

		System.out.println("A =");
		for (i = 0; i < TAM; i++) {
			System.out.print(a[i] + " ");
		}


		System.out.println("\nB =");
		for (i = 0; i < TAM; i++) {
			System.out.print(b[i] + " ");
		}
		
	}
	
}