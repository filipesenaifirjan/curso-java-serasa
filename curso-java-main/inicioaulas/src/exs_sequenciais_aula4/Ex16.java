package exs_sequenciais_aula4;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de cigarros fumados por dia: ");
        int qtdCigarros = scan.nextInt();

        System.out.println("Digite por quantos anos a pessoa já fumou: ");
        int anosFumante = scan.nextInt();

        int tempoPerdidoMin = qtdCigarros * 10 * 365 * anosFumante;
        int tempoPerdidoDias = tempoPerdidoMin / (24 * 60);

        System.out.println("Você perdeu aproximadamente " + tempoPerdidoDias + " dias de vida.");

        scan.close();
    }
}

