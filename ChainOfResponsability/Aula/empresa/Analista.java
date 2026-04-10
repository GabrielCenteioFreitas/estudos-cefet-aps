package ChainOfResponsability.Aula.empresa;

public class Analista extends Funcionario {
	
	public Analista(Funcionario f) {
		super(f);
	}
	
	@Override
	public void executar() {
		System.out.println("Analista executando!");
	}
}
