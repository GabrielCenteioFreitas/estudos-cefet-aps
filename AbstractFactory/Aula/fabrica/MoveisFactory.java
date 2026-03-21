package AbstractFactory.Aula.fabrica;

import produtos.*;

public abstract class MoveisFactory {
	
	//Definição dos "Factory Methods" que cada
	// fábrica concreta deve implementar
	protected abstract ICadeira criaCadeira();
	
	protected abstract IPoltrona criaPoltrona();
	
	//Método para facilitar o teste. 
	//Já cria todos os produtos de uma linha 
	//e invoca seus respectivos métodos
	public void criaMoveis() {
		ICadeira c = criaCadeira();
		c.sentar();
		
		//Acrescentar objetos dos demais produtos
		IPoltrona p = criaPoltrona();
		p.descansar();
		
	}
	
	//Criar as fábricas concretas para cada família de móveis
	//Ex: MoveisModernosFactory
}
