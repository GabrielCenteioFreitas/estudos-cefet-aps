package factorymethod;

public class Trem implements ITransporte{

	@Override
	public void entrega() {
		System.out.println("Entrega realizada de trem");
	}

}
