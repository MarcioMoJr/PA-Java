package vetoresLista2;

import java.util.Scanner;

public class TabuadaVetor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 5;
		int i, mult, n[], t;

		n = new int[TAM];

		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o " + (i + 1) + "° valor");
			n[i] = in.nextInt();
		}

		for (i = 0; i < TAM; i++) {
			System.out.println();
			System.out.println("Tabuada do " + n[i] + ":");
			for (mult = 1; mult <= 10; mult++) {
				t = n[i] * mult;
				System.out.println(n[i] + " x " + mult + " = " + t);
			}
		}

	}

}
