package doWhile2;

import java.util.Scanner;

public class IdadeDoWhile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int anoNasc, anoAtual, idade;
		String resposta;

		do {
			System.out.println("Digite o ano de nascimento");
			anoNasc = in.nextInt();

			System.out.println("Digite o ano atual:");
			anoAtual = in.nextInt();

			idade = anoAtual - anoNasc;
			System.out.println("A idade é: " + idade + " anos");

			if (idade < 18) {
				System.out.println("O usuario é menor de idade");

			} else {
				System.out.println("O usuario é maior de idade");
			}
			System.out.println("\n Deseja continuar? S-Sim / N-Não");
			resposta = in.next();
		} while (resposta.equalsIgnoreCase("S"));
		in.close();
	}

}
