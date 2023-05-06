package exs_repeticao_aula4;


import javax.swing.JOptionPane ;
public class Ex3Nome {
	/*Leia o nome do usuario 
	 * e escreva o nome dele 10 vezes

	 */

	public static void main(String[] args) {
		
	        String nome = JOptionPane.showInputDialog("Digite seu nome");
	        for(int i = 0; i < 10; i++){
	            System.out.println("Nome: " + nome);
	        }
	}	

}
