package exs_sequenciais_aula4;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		        Scanner scan = new Scanner(System.in);

		        System.out.println("Digite um número real: ");
		        double numero = scan.nextDouble();

		        double dobro = numero * 2;
		        double tercaParte = numero / 3;

		        System.out.println("O dobro de "+numero+" é "+dobro+".");
		        System.out.println("A terça parte de "+numero+" é "+tercaParte+".");

		        scan.close();
		      }
		
	}