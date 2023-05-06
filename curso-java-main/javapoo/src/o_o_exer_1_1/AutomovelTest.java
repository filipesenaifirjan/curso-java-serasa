package o_o_exer_1_1;

import javax.swing.JOptionPane;

public class AutomovelTest {

	public static void main(String[] args) {
		
      Automovel automovel = new  Automovel();
		
      automovel.modelo ="Sentra 2.0 ";
      automovel.fabricante = "Nissan";
      automovel.cor ="Prata";
      automovel.pontenciaCavalos = 145;
      automovel.qtMarchas = 4;
      automovel.qtPortas = 4;
      automovel.temArCondicionado= true;
		
		System.out.println("Esta ligado? " + automovel.estaLigado);
		
		automovel.ligar(automovel.estaLigado);
		
		System.out.println("Esta ligado? " +automovel.estaLigado);
		
		JOptionPane.showMessageDialog(null, automovel.toString());
		System.out.println(automovel.toString());		
				
	}
	
}