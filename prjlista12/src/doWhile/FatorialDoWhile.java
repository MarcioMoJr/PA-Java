package doWhile;

import java.util.Scanner;

public class FatorialDoWhile {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int resultado = 1;
		int n;
		
		System.out.println("Digite o numero que deseja fatorar:");
		n = in.nextInt();
		
		if (n > 0) {
			do {
				resultado = resultado * n;
				n--;
			} while (n > 0);
		}
		System.out.println();
		System.out.println("O resultado é: " +resultado);
	}

}



