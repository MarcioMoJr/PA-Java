package vetoresLista2;

import java.util.Scanner;

public class VerificaPrimos {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM = 10;
		int i, a[], divisor, divisores;
		
		a = new int [TAM];
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i+1) + "° valor:");
			a[i] = in.nextInt();
		}
		
		for (i = 0; i < TAM; i++) {
			divisores = 0;
			
			for (divisor = 1; divisor <= a[i]; divisor++) {
				if (a[i] % divisor == 0) {
					divisores++;
				}
			}
			if ( divisores == 2) {
				System.out.println(a[i] + " é primo");
			} else {
				System.out.println(a[i] + " não é primo");
			}
		}

	}

}
