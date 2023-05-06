package orientacaoobj;

public class Carro {
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
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", fabricante=" + fabricante + ", cor=" + cor + ", qtPortas=" + qtPortas
				+ ", pontenciaCavalos=" + pontenciaCavalos + ", velocidadeMaxima=" + velocidadeMaxima + ", qtMarchas="
				+ qtMarchas + ", temArCondicionado=" + temArCondicionado + ", estaLigado=" + estaLigado + "]";
	}
	
}


