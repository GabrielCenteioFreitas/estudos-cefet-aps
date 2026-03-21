package Observer.Aula.pubsub;

import java.util.ArrayList;
import java.util.List;

public class Publicador {
	
	//Lista de observers (assinantes)
	//Estrutura de preferência (lista por ex.)
	List<IObserver> lista = new ArrayList<IObserver>();
	
	//Estado que está sob observação
	private String estado;
	
	//Método para adicionar observador
	public void addObserver(IObserver obs) {
		lista.add(obs);
	}
	
	//Método para remover observador
	public void removeObserver(IObserver obs) {
		lista.remove(obs);
	}
	
	//Método que notifica cada assinante
	//e transmite o novo estado
	public void notificar() {
		for (IObserver obs : lista) {
			obs.update(estado);
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
	
	//Método para informar estado (opcional)
}
