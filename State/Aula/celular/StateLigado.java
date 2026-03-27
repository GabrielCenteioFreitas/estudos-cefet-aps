package State.Aula.celular;

public class StateLigado extends State {

	protected StateLigado(Dispositivo cel) {
		super(cel);
	}

	@Override
	protected void botaoLigar() {
		dispositivo.setState(new StateDesligado(dispositivo));
		System.out.println("Dispositivo desligado :(");
	}

	@Override
	protected void botaoCamera() {
		dispositivo.setState(new StateAppCam(dispositivo));
		System.out.println("Câmera aberta");
	}
	
	//Todo estado define o que acontece
	//quando cada operação é invocada
	
}
