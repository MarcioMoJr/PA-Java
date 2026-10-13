package lacoFor.nivel4;

import java.util.Scanner;

public class Ex016 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, num, maiorN;
		
		for (i = 1, maiorN = 0; i <= 10; i++) {
			System.out.println("Digite o " +i+ "° número");
			num = in.nextInt();
			if (num > maiorN) {
				maiorN = num;
			}
		}
		System.out.println("O maior número digitado foi: " +maiorN);
	}

}