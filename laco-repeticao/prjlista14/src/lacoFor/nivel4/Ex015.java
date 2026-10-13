package lacoFor.nivel4;

import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, s, num;
		
		for (i = 1, s = 0; i <=10; i++)  {
			System.out.println("Digite o " +i + "° número");
			num = in.nextInt();
			s += num;
		}
		System.out.println(s);
	}

}
