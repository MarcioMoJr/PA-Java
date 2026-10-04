package doWhile2;

public class SomatoriaImpar {

	public static void main(String[] args) {
		
		int i = 1, somatoria = 0;
		
		do {
			somatoria += i;
			i += 2;
		} while (i < 1000);
		System.out.println("A somatória dos números ímapares é igual a: " + somatoria);

	}

}
