package Decorator.Aula.pizza;

public class MassaFina extends Pizza{
	
	private double valor = 18;
	
	@Override
	public void monta(double v) {
		System.out.println("Pizza com massa fina");
		System.out.println("Valor total: R$" + (this.valor + v));
	}

}
