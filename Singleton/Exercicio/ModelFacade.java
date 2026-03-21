package Singleton.Exercicio;

import Facade.Aula.model.*;

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
		// Esse arquivo estaria no mesmo package do Database, podendo acessar o método
		return Database.buscaAlunoPorId(id);
	}
	
	public Aluno buscaAlunoPorNome(String nome) {
		// Esse arquivo estaria no mesmo package do Database, podendo acessar o método
		return Database.buscaAlunoPorNome(nome);
	}
}
