package doWhile2;

public class Multiplos {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		do {
			System.out.print(i);
			if (i % 10 == 0) {
				System.out.print(" é múltiplo de 10");
			}
			System.out.println();
			i += 2;
		} while (i <= 500);
	}

}
