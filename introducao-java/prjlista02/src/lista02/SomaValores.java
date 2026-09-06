package lista02;

import java.util.Scanner;

public class SomaValores {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor1, valor2, soma;

		System.out.println("Digite o primeiro valor:");
		valor1 = ler.nextInt();

		System.out.println("Digite o segundo valor:");
		valor2 = ler.nextInt();

		soma = valor1 + valor2;
		System.out.printf("A soma é: " + soma);
		ler.close();
	}

}
