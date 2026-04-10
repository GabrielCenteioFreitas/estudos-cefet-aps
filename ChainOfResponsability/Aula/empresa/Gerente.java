package ChainOfResponsability.Aula.empresa;

public class Gerente extends Funcionario {
	
	public Gerente(Funcionario f) {
		super(f);
	}
	
	@Override
	public void gerenciar() {
		System.out.println("Gerente gerenciando!");
	}
	
	@Override
	public void executar() {
		System.out.println("Gerente precisou executar. Alguém trabalhou mal hoje");
	}
	
	//...implementar outras classes concretas
}
