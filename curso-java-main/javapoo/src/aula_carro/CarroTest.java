package aula_carro;

import javax.swing.JOptionPane;

public class CarroTest {

	public static void main(String[] args) {
    Carro carro = new Carro();
		
		carro.modelo ="Corolla 2000 XEI";
		carro.fabricante = "Toyota";
		carro.cor ="Prata";
		carro.pontenciaCavalos = 142;
		carro.qtMarchas = 4;
		carro.qtPortas = 4;
		carro.temArCondicionado= true;
		
		System.out.println("Esta ligado? " + carro.estaLigado);
		
		carro.ligar(carro.estaLigado);
		
		System.out.println("Esta ligado? " + carro.estaLigado);
		
		JOptionPane.showMessageDialog(null, carro.toString());
		System.out.println(carro.toString());
		
		
		
	}

}
