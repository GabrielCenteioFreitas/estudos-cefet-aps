package Bridge.Aula.formas.cores;

public class Cube extends Shape {

	@Override
	public void showShape() {
		System.out.print("\nSou um cubo");
		if(color != null) {
			System.out.println(" de cor " + color.getColor());
		}
		if(size != null) {
			System.out.print(" de " );
			size.measure();
		}
	}

}
