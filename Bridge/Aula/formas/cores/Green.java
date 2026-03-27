package Bridge.Aula.formas.cores;

public class Green implements Color {
	
	private String color = "verde";
	
	@Override
	public void paint() {
		System.out.println("\nPintei de " + color);
	}
	
	public String getColor() {
		return color;
	}
}
