package Observer.Aula.pubsub2;

public class ConcreteObserver2 implements IObserver2{
	
	Publicador2 pub;
	
	public void setPublicador(Publicador2 p) {
		this.pub = p;
	}
	
	@Override
	public void update() {
		System.out.println("Novo contexto: " + pub.getEstado());
		
	}

}
