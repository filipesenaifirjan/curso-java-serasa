package exs_repeticao_aula4;

import javax.swing.JOptionPane ;

public class Ex4N {
      /*Leia o nome do usuario
       *  um numero N e escreva o nome  dele
       *   na tela n vezes.
       
       */
		
		public static void main(String[] args) {
			
		try {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas vezes deseja repetir seu nome ?"));
			 
			String nome = JOptionPane.showInputDialog("Digite seu nome:");
			
			 for(int i = 0; i < num; i++) {
		            System.out.println("Nome: " + nome);
			} 
			 
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Você digitou um valor invalido. Digite numeros por favor" );
		}
		
		
			
  }
			 
}			
	        	        
	 