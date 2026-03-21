package TemplateMethod.Aula.principal;

import TemplateMethod.Aula.rotina.manha.*;

public class Cliente {
	
	public static void main(String[] args) {
		
		//Cria uma classe de rotina concreta
		RotinaManha gui = new RotinaGuilherme();
		RotinaManha gab = new RotinaGabriel();
		
		//Invoca o Template Method
		gui.templateMethod(9);
		System.out.println("---");
		gab.templateMethod(12);
	}
}
