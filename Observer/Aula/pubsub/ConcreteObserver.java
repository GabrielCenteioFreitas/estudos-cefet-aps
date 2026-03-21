package Observer.Aula.pubsub;

public class ConcreteObserver implements IObserver {

	@Override
	public void update(String contexto) {
		System.out.println("Novo contexto: " + contexto);		
	}

}
