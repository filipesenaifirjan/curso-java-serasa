package exerciciosAulas1_2;

import java.util.Scanner;

public class Ex02_Aula1_CampeonatoBrasileiro {
   

			//Usando a classe scanner para entrada de dados, faça uma classe que receba dois valores inteiros.
	       //O primeiro valor corresponde a quantidade de pontos do lider do campeonato brasileiro de futebol .
	       //O segundo valor corresponde a quantidade de pontos do time lanterna.
	      //Considerando que cada vitoria vale 3 pontos,elaabore uma classe que calcule o numero de vitorias 
	     //necessarias para que o time lanterna alcance (ou ultrapasse) o lider. Por exemplo, supondo que as quantidades de ponto fornecidas
	    // sejam 40 e 22, entao o numero de vitorias apresentada na saida devera ser 6,pois(40-22)/3=6.
	
      public static void main(String[] args) {
    	  
    	  try(Scanner scan = new Scanner(System.in)) {
    		  System.out.print("Digite quantidade de pontos do lider:");
    	      int pontosLider = scan.nextInt();
    	      
    	      System.out.print("Digite quantidade de pontos do lanterna:");
    	      int pontosLanterna = scan.nextInt();
    	      
    	      int diferencaPontos = pontosLider - pontosLanterna;
    	      int numVitorias = diferencaPontos /3;
    	      
    	      System.out.println("Número de vitórias necessárias para o lanterna alcançar o líder: " + numVitorias);
    	           	      
        
    }
    	  
 }
      
}

