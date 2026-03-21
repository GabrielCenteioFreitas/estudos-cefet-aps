package Decorator.Aula.pizza;

public abstract class PizzaDecorator extends Pizza {
	//Atributo referenciando componente (Pizza)
	Pizza componente;
	
	//Construtor inicializando componente
	public PizzaDecorator(Pizza c) {
		this.componente = c;
	}
	
	//Método precisa chamar a operação do componente
	public void monta(double v) {
		this.componente.monta(v);
	}
	
}
