package matrizes;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {

		int a[][] = new int[3][3];
		int i, j, maior, menor, linhaMaior = 0, colunaMaior = 0, linhaMenor = 0, colunaMenor = 0;

		Random in = new Random();

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = in.nextInt(100);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		maior = a[0][0];
		menor = a[0][0];

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {

				if (a[i][j] > maior) {
					maior = a[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}

				if (a[i][j] < menor) {
					menor = a[i][j];
					linhaMenor = i;
					colunaMenor = j;
				}
			}
		}

		System.out.println("\nMaior valor: " + maior);
		System.out.println("Posição: linha " + linhaMaior + ", coluna " + colunaMaior);

		System.out.println("\nMenor valor: " + menor);
		System.out.println("Posição: linha " + linhaMenor + ", coluna " + colunaMenor);
	}
}