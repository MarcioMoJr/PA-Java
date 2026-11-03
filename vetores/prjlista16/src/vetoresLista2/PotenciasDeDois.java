package vetoresLista2;

public class PotenciasDeDois {

	public static void main(String[] args) {

		final int TAM = 11;
		int i, a[] = new int[TAM];
		a[0] = 1;

		for (i = 1; i < TAM; i++) {
			a[i] = a[i - 1] * 2;
		}

		for (i = 0; i < TAM; i++) {
			System.out.println("A[" + i + "] = 2^" + i + " = " + a[i]);
		}

	}

}
