package Decorator.Aula.pizza;

public abstract class Pizza {
	//Método abstrato que toda a hierarquia
	//de decoradores irão utilizar
	protected abstract void monta(double v);
	
	public void montaPizza() {
		monta(0);
	}

}
