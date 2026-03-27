package State.Aula.celular;

public abstract class State {
	
	//Referência para o dispositivo
	protected Dispositivo dispositivo;
	
	protected State (Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	//Métodos protegidos abstratos que representam as operações do celular 
	protected abstract void botaoLigar();
	
	protected abstract void botaoCamera();
}
