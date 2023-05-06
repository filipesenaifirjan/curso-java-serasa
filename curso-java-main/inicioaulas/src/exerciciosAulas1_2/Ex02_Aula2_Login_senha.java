package exerciciosAulas1_2;

import javax.swing.JOptionPane;
 
public class Ex02_Aula2_Login_senha {
	
	
		/*Exercicio aula_2
		 * 2. Faça uma classe que solicite login e senha, simulando o acesso a um sistema.
		 Considere que os conteúdos de login e senha originais são iguais a “java8”.
		 O usuário deverá fornecer login e senha e você irá compará-los com os conteúdos originais.
		 O usuário tem três chances para digitar corretamente os dados de login e senha.
		 Para cada tentativa incorreta deve aparecer uma mensagem alertando o erro e apresentando a quantidade de
		 tentativas que ainda restam. Veja um exemplo de execução abaixo, em que o usuário já
		 digitou o login e senha incorretos por duas vezes, restando apenas uma última chance. 
			 * 
			 */

	public static void main(String[] args) {
		
		    String loginCorreta = "java8";
	        String senhaCorreta = "java8";

	        int tentativas =3;
	        while (tentativas > 0) {
	        	String login = JOptionPane.showInputDialog("Digite o login:");
	        	String senha =JOptionPane.showInputDialog("Digite o senha:");
	        	
	        
	     if (login.equals(loginCorreta) && (senha.equals(senhaCorreta))) {
	                JOptionPane.showMessageDialog(null, "Acesso liberado!");
	                break;
	            }
	            else {
	                tentativas --;
	                JOptionPane.showMessageDialog(null,"Dados de login ou senhas incorretos. Tentativas restantes:" + tentativas );
	            }
	        }
	         if (tentativas == 0) {
	            JOptionPane.showMessageDialog(null, "Número máximo de tentativas excedido. Acesso negado.");
	
	         }
	}
}	

	