package FactoryMethod.Aula.factorymethod;

public class TremFabrica extends Logistica{

	@Override
	public ITransporte criaTransporte() {
		return new Trem();
	}

}
