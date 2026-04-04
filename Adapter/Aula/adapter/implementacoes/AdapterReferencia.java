package Adapter.Aula.adapter.implementacoes;

public class AdapterReferencia implements Target{
	
	//Composição com a classe adaptada
	private Adaptee adaptee;
	
	public AdapterReferencia(Adaptee a) {
		this.adaptee = a;
	}

	@Override
	public void request() {
		//Chama o método "legado" de Adaptee
		adaptee.specificRequest();
		
		// Faz as conversões necessárias
		//e devolve os dados convertidos
		System.out.println("Faz adaptações necessárias");
		System.out.println("Devolvendo dados convertidos");
	}
	
	//Pode definir Adaptee no construtor
	//ou receber Adaptee em um método setAdaptee
}
