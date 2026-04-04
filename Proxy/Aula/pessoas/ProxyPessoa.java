package Proxy.Aula.pessoas;

public class ProxyPessoa implements Pessoa {
	
	//atributos privados id e pessoa
	private long id;
	
	//Referência do proxy para a classe concreta de Pessoa
	Pessoa pessoa;
	
	public ProxyPessoa(long id) {
		this.id = id;
	}
	
	//O funcionamento do atributo id é o mesmo
	@Override
	public long getId() {
		return this.id;
	}

	//getNome() recebe um lazy initialization
	//Só vai no disco (PessoaDAO) buscar o nome 
	// se pessoa estiver null. E só vai uma vez
	@Override
	public String getNome() {
		if(pessoa == null) {
			pessoa = PessoaDAO.getPessoaById(id);
		}
		
		return pessoa.getNome();
	}

}
