package o_o_exer_1_1;

public class Automovel {

	String modelo;
	String fabricante;
	String cor;
	
	int qtPortas;
	int pontenciaCavalos;
	double velocidadeMaxima;
	int qtMarchas;
	boolean temArCondicionado;
	boolean estaLigado = false;

	public void ligar(boolean estaLigado) {
		if (estaLigado == false) {
			this.estaLigado = true;
			
		}
		
		
	}
	public void desligar(boolean estaLigado) {
		if (estaLigado) {
			this.estaLigado = false;
		}	
	}
	
}
	
	
/*

/*
* Exercício 1.1. 
* Descreva em no máximo 200 palavras o que é um automóvel e o que ele faz. 
* 
* Liste os substantivos e verbos separadamente. 
* 
* Cada substantivo corresponde a um objeto que precisará ser construído para implementar um sistema, nesse caso, um carro. 
* 
* Selecione 5 dos objetos que você listou e, para cada um, liste vários atributos e comportamentos. 
* 
* Descreva brevemente como esses objetos interagem entre si e com outros objetos na sua descrição. 
* 
* Estes passos que você seguiu são típicos do projeto orientado a objetos.

*                 Automóvel ou carro :
*   É um veículo motorizado que se move por meios próprios, tendo a sua própia fonte de energia (motor).
*   Nesta definição se enquadram todos os meios mecânicos de transporte: veículo, carro, viatura.
*  
*  A maioria das definições de carro diz que eles correm basicamente em estradas.
*  Com capacidade para até oito pessoas, exclusive o condutor.
*  
*        
*         Substantivos:
* 
* Motor
* Acelerador
* Volante
* velocimetro
* Pneus
* Suspensão
* Combustível
* Limpador-Para-Brisa
* Porta Malas
* Embreagem
* Caixa de cambio
*
*            Verbos:
*                  
* Ligado 
* Desligado
* Acelerar
* Frear
* Virar
*Abastecer
*carregar
*Limpar
*Trocar
* 
* 
* Atributos e comportamentos:
* 
* 

* 
* Embreagem:Platô, disco, cabo, sistema hidráulico, rolamento,trocas de marchas manuais 
* Limpador-Para-Brisa :
* Motor: cilindrada, potência, torque, consumo, velocidade máxima, ruído
* Caixa de cambio: Automática, Manual, número de marchas.
* Pneus: Borracha, preto, ar , tamanho,polegada
* Porta Malas: Capacidade, volume
* 
* 
* Interação entre  os  Objetos:
* 
* Embreagem:Controle de velocidade do motor,trocas de marchas, 
* produção de força exata a cada movimento,ao sair do lugar.
* 
* Motor entrada da mistura combustível-ar, compressão dessa mistura, 
* explosão e escape dos gases formados.
* 
* 
*
* 
*/