package ex5;

public class Ingresso {
	
	/* 5- Crie um classe chamada ingresso que possua um atributo valor e um metodo toString 
	 * que retorne a informação do valor do ingresso;
	 * A) crie uma classe IngressoVip ,que herda de ingresso e possui um atributo valor Adicional. 
	 * O metodo toString da classe IngressoVip deve considerar que o valor do ingresso é o valor da superclasse 
	 * somado ao valor Adicional do IngressoVIP.
	 * B) Criei uma classe para testar os projetos das classes Ingresso e IngressoVip.
	 * 
	 * Ingresso / - valor:float-------- 
	 * + Ingresso()
	 * + Ingresso(all attribs)
	 * /all gets and sets + toString():String
	 * 
	 *  IngressoVIP
	 *   valor:float-------- 
	 * + Ingresso()
	 * + Ingresso(all attribs)
	 * /all gets and sets + toString():String
	 *  
	 */
	
    private double valor;
	
	public Ingresso () {}

	public Ingresso(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Ingresso [valor=" + valor + "]";
	}
		
	
	}
     
	
	
	
	
	
	
	


