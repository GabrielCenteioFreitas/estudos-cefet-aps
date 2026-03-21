package Observer.Aula.pubsub;

//Implementação em que Observer NÃO conhece o publisher
//recebe o estado via update
public interface IObserver {
	
	public abstract void update(String contexto);
	
	//Criar os observers (assinantes/subscribers) concretos
	//Cada um implementa update à sua maneira
}
