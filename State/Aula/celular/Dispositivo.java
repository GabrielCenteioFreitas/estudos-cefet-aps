package State.Aula.celular;

public class Dispositivo {
	
	//Referência privada para o State
	private State estado;
	
	public Dispositivo() {
		//Define o estado inicial
		this.estado = new StateDesligado(this);
	}
	
	//Método que permite alterar o estado
	//(geralmente encapsulado)
	protected void setState(State estado) {
		this.estado = estado;
	}
	
	//Métodos das operações disponíveis no 
	// dispositivo que podem ser invocados externamente.
	//Cada método invoca o seu correspondente do State
	
	public void botaoLigar() {
		estado.botaoLigar();
	}
	
	public void botaoCamera() {
		estado.botaoCamera();
	}
	
}
