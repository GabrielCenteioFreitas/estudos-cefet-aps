package Observer.Aula.pubsub2;

public class Cliente {
	
	public static void main(String args[]) {

		//Cria um Publicador
		Publicador2 pub = new Publicador2();
		
		pub.setEstado("Oi");
		
		//Cria os Observers
		IObserver2 obs1 = new ConcreteObserver2();
		IObserver2 obs2 = new ConcreteObserver2();
		IObserver2 obs3 = new ConcreteObserver2();
;		
		//Pode definir o Publicador do Observer
		//já no construtor
		pub.addObserver(obs1);
		pub.addObserver(obs2);
		pub.addObserver(obs3);

		//Muda estado do Publicador
		pub.setEstado("Tchau");
		pub.setEstado("Tchau tchau");
	}
}
