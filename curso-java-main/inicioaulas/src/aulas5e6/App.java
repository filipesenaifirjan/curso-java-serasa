package aulas5e6;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		System.out.println("Arrendoamento Ceil: " + Math.ceil(1.0001));
		System.out.println("Arrendoamento Floor: " + Math.floor(1.0001));
		System.out.println("Maior valor entre 54 e 87: "+ Math.max(54,87));
		System.out.println("Menor valor entre 54 e 87: "+ Math.min(54,87));
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero para ver a sua raiz quadrada"));
		System.out.println("Raiz quadrada: " + Math.sqrt(numero));
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base"));
		int potencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a potencia"));
		System.out.println("Potencia: " + Math.pow(base, potencia));
		
		
		System.out.println("Valor absoluto : " + Math.abs(-50));
		System.out.println("Arrendoamento com round: " + Math.round(5.5));
		
		System.out.println("Random " + (int) (Math.random() * 10000));
		
		
	}

}
