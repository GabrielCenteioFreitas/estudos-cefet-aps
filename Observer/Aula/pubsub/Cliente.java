package Observer.Aula.pubsub;

public class Cliente {
	
	public static void main(String args[]) {
		
		//Cria um Publicador
		Publicador pub = new Publicador();
		pub.setEstado("Boa tarde");
		
		//Cria os Observers
		IObserver obs1 = new ConcreteObserver();
		IObserver obs2 = new ConcreteObserverDebochado();
		IObserver obs3 = new ConcreteObserver();
		
		//Adiciona os objetos observadores na lista do Publicador
		pub.addObserver(obs1);
		pub.addObserver(obs2);
		pub.addObserver(obs3);
		
		//Muda estado do Publicador
		pub.setEstado("Boa tarde, leitores");
		pub.setEstado("Querido e gentil leitor");
	}
}
