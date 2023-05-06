package exs_repeticao_aula4;

import javax.swing.JOptionPane ;

public class Ex5 {
	/*Escreva um algaritmo que leia
	 * 10 numeros  e calcule 
	 * a soma desses numeros
	 */
	public static void main(String[] args) {
		
		int soma = 0;
		
		try {
			for(int i = 0; i < 10; i++) {
		       int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
		       soma += num;
		     System.out.println("Soma agora: " + soma);
			
		    }  
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null,"erro:" + e.getLocalizedMessage());
			e.printStackTrace();
		}
		
		 System.out.println("Soma total: " + soma);
	   }              
	        
	}
