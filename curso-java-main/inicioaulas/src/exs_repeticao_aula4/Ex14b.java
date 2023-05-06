package exs_repeticao_aula4;
	
import java.util.Scanner;
	/*Faça um algoritmo que leia 20 numeros e,
	 *  ao final, escreva 
	 * quantos estao entre 0 e 100 
	 * e quantos são maiores de 200.*/

public class Ex14b {
public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		   
		   int num =0;
		   int nuEntre0E100 = 0;
		   int nuEntre100E200 = 0;
		   int maiorQue200 = 0;
		        
		      for (int i = 1; i <= 10; i++) {
		    	  
		          System.out.println("Digite o " + i + "º número: ");
		             num = scan.nextInt();
		            
		            if (num >= 0 && num <= 100) {
		            	nuEntre0E100 ++;
		                
		            } else if (num > 100 && num <= 200) {
		            	nuEntre100E200++;
		                
		            } else {
		            	maiorQue200++;
		            }
		        }
		        
		        System.out.println("Quantidade de números entre 0 e 100: " + nuEntre0E100);
		        System.out.println("Quantidade de números entre 101 e 200: " + nuEntre100E200);
		        System.out.println("Quantidade de números acima de 200: " + maiorQue200);
		        
		        scan.close();
		    }
		}