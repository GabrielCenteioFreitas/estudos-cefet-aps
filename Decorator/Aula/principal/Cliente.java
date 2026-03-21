package Decorator.Aula.principal;

import Decorator.Aula.pizza.*;

public class Cliente {

	public static void main(String[] args) {
		
		//Cria um objeto pizza de uma das massas
		Pizza p = new MassaTradicional();
		
		//Cria cada decorador desejado, passando o objeto
		p = new Calabresa(p);
		p = new Nutella(p);
		p = new Nutella(p);
		p = new Nutella(p);
		p = new Nutella(p);
		p = new Ovo(p);
		p = new Oregano(p);

		//Ao final o objeto invoca o método de montagem
		p.montaPizza();
	}

}
