package aulas5e6;

import javax.swing.JOptionPane;
public class Cartao {

	public static void main(String[] args) {
		
		for(int cartao = 1; cartao <= 4; cartao++) {
			String numerosCartao = "";
			for(int numDezena = 1; numDezena <= 6; numDezena++) {
				int num = (int) (Math.random() * 100);
				numerosCartao += num + "      ";
			}
			JOptionPane.showMessageDialog(null,"Numeros do cartão: " + cartao + "\n" + numerosCartao);
		}
	}

}
