package Facade.Aula.model;

//Exemplo de qualquer entidade
//com seus atributos, construtores
//e métodos
public class Aluno {
	private long id;
	private String nome;
	
	public Aluno(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public void imprimeAluno() {
		System.out.println("id=" + id + ", nome=" + nome);
	}
}

//Podemos ter outras entidades...
