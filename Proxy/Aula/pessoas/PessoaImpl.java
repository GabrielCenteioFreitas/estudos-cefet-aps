package Proxy.Aula.pessoas;

public class PessoaImpl implements Pessoa {
	
	private long id;
	private String nome;
	
	protected PessoaImpl(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	@Override
	public long getId() {
		return this.id;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

}
