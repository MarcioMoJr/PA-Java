package lista03;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double salario, novo_salario;

		System.out.println("Digite o salário atual:");
		salario = ler.nextDouble();

		novo_salario = salario * 1.10;
		System.out.println("O salário com reajuste aplicado é: " + novo_salario);
		
		ler.close();
	}

}
