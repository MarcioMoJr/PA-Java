package lacoFor.nivel4;

import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int i, num, q;

		for (i = 1, q = 0; i <= 10; i++) {
			System.out.println("Digite o " + i + "° número");
			num = in.nextInt();
			if (num % 2 == 0) {
				q++;
			}
		}
		System.out.println("Quantidade de números pares: " + q);
	}

}
