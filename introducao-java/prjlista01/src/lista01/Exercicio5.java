package lista01;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double preco, porcentagem, valorDesconto, precoFinal;
		
		System.out.println("Digite o preço do produto:");
		preco = ler.nextDouble();
		
		System.out.println("Digite a % de desconto");
		porcentagem = ler.nextDouble();
		
		valorDesconto = preco * (porcentagem / 100.0);
		precoFinal = preco - valorDesconto;
		System.out.println("O valor do desconto é: R$ " + valorDesconto);
		System.out.println("\nO preço final a pagar é: R$ " + precoFinal);
		ler.close();

	}

}
