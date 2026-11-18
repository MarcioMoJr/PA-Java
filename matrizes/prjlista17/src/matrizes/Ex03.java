package matrizes;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {

		int a[][] = new int[3][4];
		int i, j, soma;

		Random in = new Random();

		for (i = 0; i < 3; i++) {
			soma = 0;

			for (j = 0; j < 3; j++) {
				a[i][j] = in.nextInt(10);
				soma += a[i][j];

			}
			a[i][3] = soma;
		}
		
		for ( i = 0; i < 3; i++) {
			for ( j = 0; j < 4; j++) {
				System.out.print(a[i][j] + "+ ");
			}
			System.out.println();
		}
	}

}