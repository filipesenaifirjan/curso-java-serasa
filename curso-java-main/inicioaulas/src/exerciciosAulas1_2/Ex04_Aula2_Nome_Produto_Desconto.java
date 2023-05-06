package exerciciosAulas1_2;

import javax.swing.JOptionPane;

//Usando JOptionPane, elabore uma classe que receba o nome de um produto e o seu valor. 
//O desconto deve ser calculado de acordo com o valor fornecido conforme abaixo. 
//Utilizando a estrutura if-else, apresente em tela o nome do produto, valor original do 
//produto e o novo valor depois de ser realizado o desconto. Caso o valor digitado seja 
//menor que zero, deve ser emitida uma mensagem de aviso.

 public class Ex04_Aula2_Nome_Produto_Desconto {
    
    public static void main(String[] args) {
    	
    	
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
        
        String valorProduto = JOptionPane.showInputDialog("Digite o valor do produto:");
        double valor = Double.parseDouble(valorProduto);
        
        double desconto = 0;
        
        if (valor >= 50 && valor < 200) {
        	
            desconto = 5;
            
        } else if (valor >= 200 && valor < 500) {
        	
            desconto = 6;
            
        } else if (valor >= 500 && valor < 1000) {
            desconto = 8;
            
        } else if (valor >1000) {
            desconto = 10;
        }
        
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        } else {
            double valorComDesconto = valor * (100 - desconto) / 100;
            
            String mensagem = "Produto: " + nomeProduto + "\n" +
                              "Valor original: R$ " + valor + "\n" +
                              "Valor com desconto: R$ " + valorComDesconto;
            
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}
