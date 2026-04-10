package ChainOfResponsability.Aula.empresa;

public abstract class Funcionario {
	
	//Referência para o superior na hierarquia (sucessor)
	public Funcionario funcionario;
	
	public Funcionario(Funcionario f) {
		this.funcionario = f;
	}
	
	//Métodos definidos na classe abstrata apenas 
	//repassam a execução para seu superior
	public void gerenciar() {
		this.funcionario.gerenciar();
	}
	
	public void coordenar() {
		this.funcionario.coordenar();
	}
	
	public void executar() {
		try {
			this.funcionario.executar();
		}catch(Exception e) {
			System.out.println("Ninguém para tratar");
		}
	}
	
	//Pergunta: E se o superior também não 
	//souber executar aquela função?
	//O que pode ser feito para prevenir erro?
	//try-catch
}
