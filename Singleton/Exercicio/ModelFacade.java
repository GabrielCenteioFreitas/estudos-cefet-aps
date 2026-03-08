public class ModelFacade {
	private static ModelFacade instancia;
	
	private ModelFacade() {}
	
	public static ModelFacade getInstance() {
		if(instancia == null) {
			instancia = new ModelFacade();
		}

		return instancia;
	}

	public Aluno buscaAlunoPorId(long id) {
		return Database.buscaAlunoPorId(id);
	}
	
	public Aluno buscaAlunoPorNome(String nome) {
		return Database.buscaAlunoPorNome(nome);
	}
}
