package factorymethod;

public class Moto implements ITransporte{

	@Override
	public void entrega() {
		System.out.println("Entrega realizada de moto");
	}

}
