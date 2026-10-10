package lacoFor.nivel3;

import java.util.Scanner;

public class Ex011 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int i, n, t;
        
        System.out.println("Digite o numero");
        n = in.nextInt();
        
        for (i = 1; i <= 10; i++) {
            t = n * i;
            System.out.println(n + " x " + i + " = " + t);
		}

	}

}