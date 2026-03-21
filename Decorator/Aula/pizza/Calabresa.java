package Decorator.Aula.pizza;

public class Calabresa extends PizzaDecorator {
	
	private double valor = 5;
			
	//Construtor recebendo componente
	public Calabresa(Pizza c) {
		super(c);
	}

	//Método chamando operação monta() da superclasse 
	//e sua operação específica
	public void monta(double v) {
		super.monta(v + valor);
		//adiciona calabresa
		addCalabresa();
	}
	
	public void addCalabresa() {
		System.out.println("Calabresa adicionada");
	}

}
