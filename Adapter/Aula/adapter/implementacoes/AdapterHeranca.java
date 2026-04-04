package Adapter.Aula.adapter.implementacoes;

public class AdapterHeranca extends Adaptee implements Target{

	@Override
	public void request() {
		//Método que faz as adaptações e consegue invocar o método
		//da classe adaptada
		
		//Chama o método "legado"
		super.specificRequest();
		
		// Faz as conversões necessárias
		//e devolve os dados convertidos
		System.out.println("Faz adaptações necessárias");
		System.out.println("Devolvendo dados convertidos");
	}
}
