package prjlistaTomadaDecisao;

import java.util.Scanner;

public class Salario {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double sal, salMin;
		
		System.out.println("Digite o salário:");
		sal = ler.nextDouble();
		
		System.out.println("Digite o salário mínimo:");
		salMin = ler.nextDouble();
		
		if (sal<salMin) {
			System.out.println("Salário irregular");
		
		} else {
			System.out.println("Salário válido");
		}
		ler.close();
    }
}
