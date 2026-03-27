package State.Aula.celular;

public class StateDesligado extends State {

	protected StateDesligado(Dispositivo cel) {
		super(cel);
	}

	@Override
	protected void botaoLigar() {
		dispositivo.setState(new StateLigado(dispositivo));
		System.out.println("Dispositivo ligado!");
	}

	@Override
	protected void botaoCamera() {
		System.out.println("Nada acontece");
	}
	
	//Todo estado define o que acontece
	//quando cada operação é invocada
	
}
