package exs_condicionais_aula4;
import java.util.Scanner;

public class Ex9 {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Digite o tamanho do primeiro segmento de reta:");
	        double a = scan.nextDouble();
	        
	        System.out.println("Digite o tamanho do segundo segmento de reta:");
	        double b = scan.nextDouble();
	        
	        System.out.println("Digite o tamanho do terceiro segmento de reta:");
	        double c = scan.nextDouble();
	        
	        if (a < b + c && b < a + c && c < a + b) {
	            System.out.println("É possível formar um triângulo com essas retas!");
	        } else {
	            System.out.println("Não é possível formar um triângulo com essas retas.");
	        }
	        
	        scan.close();
	    }
	}
