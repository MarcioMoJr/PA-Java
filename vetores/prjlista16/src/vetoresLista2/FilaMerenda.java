package vetoresLista2;

import java.util.Scanner;

public class FilaMerenda {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 10;
		int i, qnt = 0, achou, senha, a[] = new int[TAM];

		do {
			System.out.println("Digite a sua senha:");
			senha = in.nextInt();

			achou = 0;
			for (i = 0; i < qnt; i++) {
				if (senha == a[i]) {
					achou = 1;
				}

			}

			if (achou == 0) {
				System.out.println("Merenda liberada!");
				System.out.println();
				a[qnt] = senha;
				qnt++;
			} else {
				System.out.println("Essa senha já pegou a merenda!");
				System.out.println();
			}

		} while (qnt < TAM);
		
		System.out.println("Senhas registradas:");
		for (i = 0; i < qnt; i++) {
			System.out.println("Senha " + (i + 1) + ": " + a[i]);
		}

	}

}
