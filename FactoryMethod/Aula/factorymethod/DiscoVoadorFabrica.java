package FactoryMethod.Aula.factorymethod;

public class DiscoVoadorFabrica extends Logistica{

	@Override
	public ITransporte criaTransporte() {
		return new DiscoVoador();
	}

}
