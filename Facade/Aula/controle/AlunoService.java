package Facade.Aula.controle;

import Facade.Aula.model.*;

public class AlunoService {
	//pode ter atributos
	//outros metodos
	//lógica de serviço
	
	public static void buscarAlunoId(long id) {
		
		//Como recupera um aluno do banco,
		//a partir do seu ID?
		//Usando meu ponto de acesso (Facade)
		ModelFacade facade = new ModelFacade();
		Aluno a = facade.buscaAlunoPorId(id);
		a.imprimeAluno();
		
		//E se possuísse outra informação, sem ser o 
		// ID do aluno. Como recuperar?
		//Basta chamar o método correspondente disponível
		//na classe ModelFacade
	}
	
	public static void buscarAlunoNome(String nome) {
		ModelFacade facade = new ModelFacade();
		Aluno a = facade.buscaAlunoPorNome(nome);
		a.imprimeAluno();
	}
}
