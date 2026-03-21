package Decorator.Aula.pizza;

public class Ovo extends PizzaDecorator {
	
	private double valor = 4.5;
	
	//Construtor recebendo componente
	public Ovo(Pizza c) {
		super(c);
	}

	//Método chamando operação monta() da superclasse 
	//e sua operação específica
	public void monta(double v) {
		super.monta(valor + v);
		//adiciona ovo
		addOvo();
	}
	
	public void addOvo() {
		System.out.println("Ovo adicionado");
	}

}
