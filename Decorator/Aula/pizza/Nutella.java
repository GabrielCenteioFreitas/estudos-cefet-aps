package Decorator.Aula.pizza;

public class Nutella extends PizzaDecorator {
	
	private double valor = 12.99;
	
	//Construtor recebendo componente
	public Nutella(Pizza c) {
		super(c);
	}

	//Método chamando operação monta() da superclasse 
	//e sua operação específica
	public void monta(double v) {
		super.monta(valor + v);
		//adiciona nutella
		addNutella();
	}
	
	public void addNutella() {
		System.out.println("Nutella adicionada");
	}

}
