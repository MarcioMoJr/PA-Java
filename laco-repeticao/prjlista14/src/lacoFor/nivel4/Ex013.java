package lacoFor.nivel4;

import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, n;
		
		System.out.println("Digite um número:");
		n = in.nextInt();
		
		for (i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}

}
