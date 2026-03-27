package State.Aula.main;

import State.Aula.celular.Dispositivo;

public class Cliente {

	public static void main(String[] args) {
		//Cria um objeto dispositivo
		Dispositivo dispositivo = new Dispositivo();
		
		//Simulação do cliente usando o dispositivo
		//Invoca operações que trocam seu estado
		dispositivo.botaoLigar();
		dispositivo.botaoLigar();
		dispositivo.botaoCamera();
		dispositivo.botaoLigar();
		dispositivo.botaoCamera();
		dispositivo.botaoCamera();
		dispositivo.botaoCamera();
		dispositivo.botaoLigar();
		dispositivo.botaoCamera();
		
	}

}
