package Bridge.Aula.formas.cores;

public abstract class Shape {
	
	//Bridge (ponte) para a outra hierarquia de classes
	protected Color color;
	
	//Outra bridge
	protected Size size;
	
	//Método para definir a Bridge color
	public void setColor(Color color) {
		this.color = color;
	}
	
	//Método para definir a Bridge size
	public void setSize(Size size) {
		this.size = size;
	}
	
	// Método que aciona a Bridge
	//invocando método da composição
	public void paint() {
		color.paint();
	}
	public void measure() {
		size.measure();
	}
	
	
	//Método que todo Shape precisa ter
	public abstract void showShape();
	
	//Criar classes Shape concretas

}
