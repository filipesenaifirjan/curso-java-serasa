package exs_if_com_else;

import javax.swing.JOptionPane;

public class IfComElseMes {

	public static void main(String[] args) {
		
		String aux =JOptionPane.showInputDialog("Forneça o numero do mês");
		
		if (aux != null) {
			
			try {
				int mes =Integer.parseInt(aux);
			    if (mes >= 1 && mes <= 12) {
			    	
			       JOptionPane.showMessageDialog(null, "Numero de mês valido!\n" + mes);
			
				}else {
					JOptionPane.showMessageDialog(null, "Numero de mês invalido!\n" + mes);	
				}
			}catch (NumberFormatException erro)  {
				JOptionPane.showMessageDialog(null, "Digite apenas valores inteiros " + erro);	
       
			}
		}else {
			JOptionPane.showMessageDialog(null, "Operação cancelada");
			
        }
        System.exit(0);
	}     
}   
	
