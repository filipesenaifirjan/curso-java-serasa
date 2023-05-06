package exs_sequenciais_aula4;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		 System.out.println("Digite o valor de A: ");
	        double a = scan.nextDouble();

	        System.out.println("Digite o valor de B: ");
	        double b = scan.nextDouble();

	        System.out.println("Digite o valor de C: ");
	        double c = scan.nextDouble();

	        double delta = Math.pow(b, 2) - 4 * a * c;

	        System.out.println("O valor de Delta é: " + delta);

	        scan.close();
	    }
	}
