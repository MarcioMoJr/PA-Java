package lista01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3, soma; //declaração de variáveis
		
		System.out.println("Digite o primeiro número:");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo número:");
		n2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número:");
		n3 = ler.nextInt();
		
		soma = (n1 * n1) + (n2 * n2) + (n3 * n3);
		System.out.println("A soma dos quadrados é:" + soma);
		ler.close();

	}

}
