package Flyweight.Aula.main;

import java.util.ArrayList;
import java.util.List;

import Flyweight.Aula.floresta.*;

public class Cliente {

	public static void main(String[] args) {
		//Para simplificar não precisa criar Floresta
		//Apenas cria vários objetos árvore e as desenha
		List<Tree> floresta = new ArrayList<Tree>();
		floresta.add(new Tree(20,50,"Oliveira"));
		floresta.add(new Tree(40,60,"Carvalho"));
		floresta.add(new Tree(60,80, "Oliveira"));
		floresta.add(new Tree(100,85, "Oliveira"));
		floresta.add(new Tree(10,10, "Carvalho"));
		
		for (Tree tree : floresta) {
			tree.draw("floresta da tijuca");
		}
		
		//Como posso verificar se não foram criados vários 
		//tipos repetidos para cada objeto árvore?
		System.out.println("Tipos criados: " + TreeFactory.getListaSize());
	}

}
