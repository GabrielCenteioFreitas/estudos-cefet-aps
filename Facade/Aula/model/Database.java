package Facade.Aula.model;

//Classe que queremos proteger.
//Responsável por realizar consultas ao BD
public class Database {
	
	protected static Aluno buscaAlunoPorId(long id) {
		// Faz consulta no BD e retorna o objeto aluno
		System.out.println("Select * from Aluno where id = " + id);
		return new Aluno(id, "Aluno do id "+id);
	}
	//Podemos criar mais consultas...
	//e também para outras entidades...

	protected static Aluno buscaAlunoPorNome(String nome) {
		System.out.println("Select * from Aluno where nome = " + nome);
		String partes[] = nome.split(" ");
		long id = Long.parseLong(partes[partes.length - 1]);
		return new Aluno(id, nome);
	}
	
	
	//Algumas consultas podem ser expostas na fachada
	//e outras permanecem escondidas
	protected void calculaCrAluno(long id) {
		//Faz o cálculo do CR do aluno
		System.out.println("CR do aluno id " + id);
	}
}
