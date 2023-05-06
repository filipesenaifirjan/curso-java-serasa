package exs_condicionais_aula4;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		float nota1 = scan.nextFloat();

		System.out.println("Digite a segunda nota: ");
		float nota2 = scan.nextFloat();

		float media = (nota1 + nota2) / 2;
		System.out.println("Média: " + media);
		System.out.println("---------------------------------");

		if(media > 7.0) {
			System.out.println("Aluno aprovado");
		}
		else System.out.println("Aluno Reprovado");



		scan.close();
	}

}