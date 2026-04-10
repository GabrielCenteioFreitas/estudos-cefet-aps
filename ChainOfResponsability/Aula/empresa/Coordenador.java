package ChainOfResponsability.Aula.empresa;

public class Coordenador extends Funcionario {
	
	public Coordenador(Funcionario f) {
		super(f);
	}
	
	@Override
	public void coordenar() {
		System.out.println("Coordenador coordenando!");
	}
}
