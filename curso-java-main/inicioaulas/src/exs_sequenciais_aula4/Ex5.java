package exs_sequenciais_aula4;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Nota 1 : ");
		float nota1 = scan.nextFloat();

		System.out.println("Nota 2: ");
		float nota2 = scan.nextFloat();

		float media = (nota1 + nota2) / 2;

		System.out.println("Média entre "+nota1 +" e "+nota2+" é igual a "+ media+".");
		System.out.println("---------------------------------");

		scan.close();
	}

}