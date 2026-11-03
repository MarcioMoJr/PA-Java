package vetoresLista2;

import java.util.Scanner;

public class SepararParesImpares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 20;
		int i, pos = 0, a[] = new int[TAM], b[] = new int[TAM];

		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o " + (i + 1) + "° valor");
			a[i] = in.nextInt();

		}
		for (i = 0; i < TAM; i++) {

			if (a[i] % 2 == 0) {
				b[pos] = a[i];
				pos++;
			}

		}
		for (i = 0; i < TAM; i++) {

			if (a[i] % 2 != 0) {
				b[pos] = a[i];
				pos++;
			}

		}
		
		for (i = 0; i <TAM; i++) {
			System.out.print(b[i] +" ");
			
		}


	}

}
