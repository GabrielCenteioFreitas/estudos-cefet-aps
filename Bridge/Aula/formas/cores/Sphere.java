package Bridge.Aula.formas.cores;

public class Sphere extends Shape {

	@Override
	public void showShape() {
		System.out.print("\nSou uma esfera");
		if(color != null) {
			System.out.print(" de cor " + color.getColor());
		}
		if(size != null) {
			System.out.print(" de " );
			size.measure();
		}
	}

}
