package factorymethod;

public class DiscoVoador implements ITransporte{

	@Override
	public void entrega() {
		System.out.println("Entrega realizada por disco voador");
	}

}
