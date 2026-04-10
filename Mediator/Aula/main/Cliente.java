package Mediator.Aula.main;
import java.util.Random;

import Mediator.Aula.jogo.*;
import Mediator.Aula.jogo.Mediator;

public class Cliente {

	public static void main(String[] args) {
		//Cria um objeto Mediator
		Mediator mediador = new Mediator();
		
		//Preparação: cria os inimigos
		mediador.prepararBatalha(4);
		
		//Cria os personagens (heroi)
		Heroi naruto = new Heroi("Naruto", mediador);
		
		//Faz ataques
		Random random = new Random();
		random.nextInt(10);
		
		naruto.atacar(1, random.nextInt(10));
		naruto.atacar(2, random.nextInt(10));
		naruto.atacar(2, random.nextInt(10));
		
		//Mostra atributos dos personagens (inimigos)
		//para ver se mediador funcionou
		
		
		
		
		
		//Podemos também delegar ao Mediator a criação 
		//do(s) herói(s)?
		//Sim, basta criar metodo que retorna Heroi
		
		
		//Como poderíamos evoluir para os inimigos também
		//poderem atacar o Herói?
		//criar metodo atacar em Inimigo, que usa atacar
		//do Mediator
	}
}
