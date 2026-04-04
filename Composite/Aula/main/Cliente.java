package Composite.Aula.main;
import Composite.Aula.formas.*;

public class Cliente {

	public static void main(String[] args) {
		//Cria a hierarquia desejada
		//As folhas são os componentes concretos
		//Todo nó não-folha são composite
		Rectangle r1 = new Rectangle();
		PictureComposite p1 = new PictureComposite();
		p1.add(new Text());
		p1.add(new Line());
		p1.add(r1);
		
		PictureComposite p2 = new PictureComposite();
		p2.add(new Line());
		p2.add(new Text());
		
		PictureComposite pRaiz = new PictureComposite();
		pRaiz.add(p1);
		pRaiz.add(p2);
		pRaiz.add(new Line());
		pRaiz.add(new Rectangle());
		
		//Testar chamadas de operações de diferentes nós
		pRaiz.draw();
		
		System.out.println("---");
		p1.draw();
		
		//Invocar a operação de um Composite significa
		//invocar a operação de todos os seus filhos
		
	}

}
