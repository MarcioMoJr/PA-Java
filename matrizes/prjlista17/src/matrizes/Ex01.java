package matrizes;

public class Ex01 {

	public static void main(String[] args) {
		int a[][] = new int[4][4], i, j, v = 2;

		for (i = 0; i < 4; i++) {
			System.out.println();
			for (j = 0; j < 4; j++) {
				a[i][j] = v;
				v = v * 2;
				System.out.print(a[i][j] + " ");
			}
		}

	}

}
