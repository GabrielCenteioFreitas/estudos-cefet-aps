package Observer.Aula.pubsub;

public class ConcreteObserverDebochado implements IObserver {

	@Override
	public void update(String contexto) {
		System.out.println(contexto + ", seu mané");		
	}

}
