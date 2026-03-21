package TemplateMethod.Aula.rotina.manha;

public class RotinaGabriel extends RotinaManha{

	@Override
	protected void tomarCafeDaManha() {
		System.out.println("Tomei café com leite com bisnaguinha");
	}

	@Override
	protected void arrumarSe() {
		System.out.println("Tomei banho, me arrumei com roupas, calcei as botas");
	}

	@Override
	protected void pentearCabelo() {
		System.out.println("Passei a mão no cabelo");
	}
	
	protected void acordar(int horas) {
		System.out.println("Tentei acordar às " + horas + " horas,"
				+ " mas acordei às " + (horas+1) + " horas");
		
	}

}
