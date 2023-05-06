package classesabstracts;

public class Automovel extends Veiculo {

	
	@Override
	public void acelerar() {
		this.setVelocidade(getVelocidade()+10);
		
	}

}
