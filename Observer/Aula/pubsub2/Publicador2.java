package Observer.Aula.pubsub2;

import java.util.ArrayList;
import java.util.List;

public class Publicador2 {
	
	//Lista de observers (assinantes)
	//Estrutura de preferência (lista por ex.)
	List<IObserver2> lista = new ArrayList<IObserver2>();
	
	//Estado que está sob observação
	private String estado;
	
	//Método para adicionar observador
	public void addObserver(IObserver2 obs) {
		lista.add(obs);
		obs.setPublicador(this);
	}
	
	//Método para remover observador
	public void removeObserver(IObserver2 obs) {
		lista.remove(obs);
	}
	
	//Método que notifica cada assinante
	//que deve coletar o novo estado
	public void notificar() {
		for (IObserver2 obs : lista) {
			obs.update();
		}
	}
	
	//Método que permite alterar o estado
	public void setEstado(String novoEstado) {
		//Altera o estado
		this.estado = novoEstado;
		//Sempre que estado altera, notifica
		//todos os assinantes
		notificar();
	}
	
	//Método para informar estado (precisa ter)
	public String getEstado() {
		return this.estado;
	}
}
