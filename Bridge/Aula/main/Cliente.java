package Bridge.Aula.main;

import Bridge.Aula.formas.cores.*;

public class Cliente {

	public static void main(String[] args) {
		//Cria shapes que podem ou não ter color
		Shape s1 = new Sphere();
		s1.showShape();
		s1.setColor(new Green());
		s1.paint();
		s1.showShape();
		
		Shape s2 = new Cube();
		s2.setColor(new Green());
		s2.setColor(new Yellow());
		s2.showShape();
		
		
		
		//Pergunta: Poderíamos criar ainda 
		//uma outra bridge para as classes Shape?
		//Sim, só criar outra composição
		s2.setSize(new Big());
		s2.showShape();
	}

}
