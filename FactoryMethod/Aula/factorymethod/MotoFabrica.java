package FactoryMethod.Aula.factorymethod;

public class MotoFabrica extends Logistica{

	@Override
	public ITransporte criaTransporte() {
		return new Moto();
	}

}
