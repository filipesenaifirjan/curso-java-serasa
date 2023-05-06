package exs_repeticao_aula4;


import javax.swing.JOptionPane;

			/*Escreva um algoritmo que leia uma sequencia de numeros 
			 * do usuario e realize a soma desses numeros,
			 * Encerre a execução quando um numero negativo for digitado */

  public class Ex15 {
     
	
	  public static void main(String[] args) {
		  
		    int controlador = 1;
	        int soma = 0;
	        
	        do {
	            int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
	            soma += num;
	            controlador = Integer.parseInt(JOptionPane.showInputDialog(" Deseja continuar? +"  + "\nDigite 1 para sim  " 
	                                                                              +"\n  Digite -2 para parar"));
	                    
	        }while (controlador >= 0);

	        JOptionPane.showMessageDialog(null, "Soma: " + soma);
	    }
	}
	    	           