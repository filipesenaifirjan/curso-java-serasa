package ex1a3.polimorf;

public class Carro {
         
	
		
	 private int velocidade = 1;
	   	
	   public void acelera() {
		      setVelocidade(getVelocidade() + 1);
	
}

  public void acelera(int aceleracao) {
	setVelocidade(getVelocidade() + aceleracao);
}

  public int getVelocidade() {
	return velocidade;
}

  public void setVelocidade(int velocidade) {
	this.velocidade = velocidade;
}

}
				
   


/*a) - Qual tipo de polimorfismo é apresentado?
 * 
 * Tipo usado é de Metodo- Horizontal
 * 
 * 
 * 
 * B) - Quais sao os sinais que indicam a apresença de Polimorfismo?
 * 
 *  Sinais de polimorfismo a assinatura  diferente do metodo.
 * 
 *  Poder ter um objeto que podemos dar paramentros e tipos diferentes para outras ------
 * */
