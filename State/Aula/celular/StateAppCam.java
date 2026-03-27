package State.Aula.celular;

public class StateAppCam extends State {

	protected StateAppCam(Dispositivo cel) {
		super(cel);
	}

	@Override
	protected void botaoLigar() {
		dispositivo.setState(new StateDesligado(dispositivo));
		System.out.println("Dispositivo desligado :( :(");
	}

	@Override
	protected void botaoCamera() {
		System.out.println("Tirando foto");
	}
	
	//Todo estado define o que acontece
	//quando cada operação é invocada
	
}
