package lista02;

import java.util.Scanner;

public class Prestacao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valor, taxa, tempo, prestacao;

		System.out.println("Digite o valor original da prestação:");
		valor = ler.nextDouble();

		System.out.println("Digite a taxa de juros:");
		taxa = ler.nextDouble();

		System.out.println("Digite os dias de atraso:");
		tempo = ler.nextDouble();

		prestacao = valor + (valor * (taxa / 100) * tempo);
		System.out.println("O valor corrigido da prestação é:" + prestacao);
		ler.close();

	}

}
