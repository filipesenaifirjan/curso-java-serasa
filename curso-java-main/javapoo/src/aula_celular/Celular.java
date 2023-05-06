package aula_celular;

public class Celular {
	
	String modelo;
	String marca;
	String tela;
    int altura;
    int largura;
    String caracteristicas;
    double peso;
    
    public void ligar() {
    	
    }
    
    public void atenderLigacao() {
    	
    }

	@Override
	public String toString() {
		return "Celular [modelo=" + modelo + ", marca=" + marca + ", altura=" + altura + ", largura=" + largura
				+ ", caracteristicas=" + caracteristicas + "]";
	}
}

