package aula_tv;

public class Televisor {
	
	int volume;
	int canal;
	
	public void aumentaVolume() {
		volume++;
	}
	public void diminuiVolume() {
		volume--;
	}
	public void trocarCanal(int c) {
		canal = c;
		
	}
	public void mostrarInfo() {
		System.out.println("Canal: "+ "volume: " + volume);
	}
}
