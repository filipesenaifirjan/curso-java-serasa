package exs_sequenciais_aula4;
import java.util.Scanner;


public class Ex12 {

	public static void main(String[] args) {
		
		        Scanner scan = new Scanner(System.in);

		        System.out.println("Digite o preço do produto: ");
		        double preco = scan.nextDouble();

		        double desconto = preco * 0.05;
		        double precoPromocional = preco - desconto;

		        System.out.println("O preço promocional do produto é: " + precoPromocional);

		        scan.close();
		    }
		
	}
