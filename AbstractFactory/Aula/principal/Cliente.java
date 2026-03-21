package AbstractFactory.Aula.principal;

import AbstractFactory.Aula.fabrica.*;

public class Cliente {

	public static void main(String[] args) {
		// Cria produtos de acordo com o estilo
		// da fábrica concreta que quiser
		
		MoveisFactory fabrica = new MoveisFuturistasFactory();
		fabrica.criaMoveis();
		
		// Pergunta: Como podemos fazer para criar uma nova
		// linha (estilo) de produtos?
		//Criar os novos produtos dessa linha e sua fábrica
		//correspontente
		System.out.println("---");
		fabrica = new MoveisMedievalFactory();
		fabrica.criaMoveis();
		
		
		// Pergunta: Como podemos fazer para aumentar a 
		// família de produtos?
		//Criar a interface do novo produto, e esse novo produto
		// para cada fabrica de produto existentes
	}

}
