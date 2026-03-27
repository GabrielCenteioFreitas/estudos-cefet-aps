package Bridge.Aula.formas.cores;

public class Yellow implements Color {
	
	private String color = "amarelo";
	
	@Override
	public void paint() {
		System.out.println("\nPintei de " + color);
	}
	
	public String getColor() {
		return color;
	}
}
