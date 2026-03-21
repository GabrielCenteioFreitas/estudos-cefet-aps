package Decorator.Aula.pizza;

public class Oregano extends PizzaDecorator {
	
	private double valor = 0.20;
	
	//Construtor recebendo componente
	public Oregano(Pizza c) {
		super(c);
	}

	//Método chamando operação monta() da superclasse 
	//e sua operação específica
	public void monta(double v) {
		super.monta(valor + v);
		//adiciona orégano
		addOregano();
	}
	
	public void addOregano() {
		System.out.println("Orégano adicionado");
	}

}
