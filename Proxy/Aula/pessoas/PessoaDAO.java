package Proxy.Aula.pessoas;

public class PessoaDAO {
	
	//Método representando uma operação custosa
	public static Pessoa getPessoaById(long id) {
		
		//Simulando acesso ao disco
		System.out.println("SELECT * FROM PESSOA WHERE ID = " + id);
		return new PessoaImpl(id, "Nome da pessoa id " + id);
	}
}
