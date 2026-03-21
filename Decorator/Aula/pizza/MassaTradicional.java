package Decorator.Aula.pizza;

public class MassaTradicional extends Pizza{
	
	private double valor = 20;
	
	@Override
	public void monta(double v) {
		System.out.println("Pizza com massa tradicional");
		System.out.println("Valor total: R$" + (this.valor + v));
	}

}
