package exs_repeticao_aula4;
	
import javax.swing.JOptionPane ;

	/*Faça um algoritmo que leia 20 numeros e,
	 *  ao final, escreva 
	 * quantos estao entre 0 e 100 
	 * e quantos são maiores de 200.*/

public class Ex14 {
public static void main(String[] args) {
		 
		   
		   int somaNumerosQueEstaoEntre0E100 =0;
		   int somaNumerosQueEstaoEntre101E200 = 0;
		   int somaNumerosMaioresQue200 = 0;
		   
		      for (int i = 1; i <= 10; i++) {
		    	  int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:" ));
		          if (num >= 0 && num <= 100) {
		        	  somaNumerosQueEstaoEntre0E100 ++;
		                
		          if (num > 100 && num <= 200) {
		        	  somaNumerosQueEstaoEntre101E200++;
		                
		          } else if (num > 200) 
		        	  somaNumerosMaioresQue200 ++;
		            
		        }
		        
		        System.out.println("Temos "+ somaNumerosQueEstaoEntre0E100 + "entre 0 e 100");
		        System.out.println("Temos " + somaNumerosQueEstaoEntre101E200 + "entre 101 e 200");
		        System.out.println("Temos " + somaNumerosMaioresQue200 + "maiores que 200");
		      } 
		        
		    }
		}