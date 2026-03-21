package Observer.Aula.pubsub2;

//Implementação em que Observer conhece o publisher
//Vai no publisher coletar o novo estado
public interface IObserver2 {
	
	public void update();
	
	public void setPublicador(Publicador2 p);
	
	//Criar os observers (assinantes/subscribers) concretos
	//Cada um implementa update à sua maneira
	//Observers possuem uma referência ao Publicador
}
