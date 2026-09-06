package lista01;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num, ant, suc; //declaração de variáveis
		
		System.out.println("Digite um numero");
		num = ler.nextInt();
		
		ant = num - 1;
		suc = num + 1;
		System.out.println("O antecessor é " + ant + " e o sucessor é " + suc);
		ler.close();
				
	}

}
