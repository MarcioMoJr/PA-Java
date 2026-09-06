package lista01;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double precoVeiculo, ipva;
		
		System.out.println("Digite o preço do veiculo:");
		precoVeiculo = ler.nextDouble();
		
		ipva = precoVeiculo * 0.04;
		System.out.println("O valor do IPVA do veiculo é:" + ipva);
		ler.close();

	}

}
