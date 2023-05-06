package aula0708;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AulaExcecoes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.hasNext();
		
		double resultado = 0.00;
		
		try {
			int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor").toString());
			int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
			Double.parseDouble(null);
			resultado = valor1 /  valor2 ;
		}catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Erro! Voce nao digitou um valor Válido");
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Erro! Voce esta tentando passar nulo");
				
		}finally {
			
			scan.close();
		}
		
		System.out.print("Resultado:" + resultado);
	}

}
