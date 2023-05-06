package utilizacaoArrays;

import javax.swing.JOptionPane;

public class Vetor {


	public static void main(String[] args) {
		
		
		
		int idades[] = new int [3];
		
		for(int i = 0 ; i < idades.length; i++) {
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade"));
		}
		
		System.out.println("----------Idades-----------------");
		try {
			for(int i = 0 ; i  < 20; i++) {
				System.out.println("Idades:" + idades[i]);
			}
		}catch (ArrayIndexOutOfBoundsException erro) {
			JOptionPane.showMessageDialog(null,"Você está tentando acessar um valor inexistente" );
		}
		

	}

}
