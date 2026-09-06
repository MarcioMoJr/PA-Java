package lista01;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double metros, km; //declaração de variáveis
		
		System.out.println("Digite uma quantidade de metros:");
		metros = ler.nextDouble();
		
		km = metros / 1000.0;
		System.out.println("Metros convertido para KM é:" + km);
		ler.close();
		
	}

}
