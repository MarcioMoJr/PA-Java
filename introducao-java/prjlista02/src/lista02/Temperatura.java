package lista02;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double f, c;

		System.out.println("Digite a temperatura em Fahrenheit:");
		f = ler.nextDouble();

		c = (f - 32) * (5.0 / 9);
		System.out.println("A temperatura em graus Celsius é:" + c);
		ler.close();
	}

}
