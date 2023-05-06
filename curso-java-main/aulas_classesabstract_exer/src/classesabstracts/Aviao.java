package classesabstracts;

public class Aviao extends Veiculo {

	public void ligar() {
		
	}

	@Override
	public void acelerar() {
		setVelocidade(getVelocidade() + 100);
		
	}


}
