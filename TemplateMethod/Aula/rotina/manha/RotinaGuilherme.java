package TemplateMethod.Aula.rotina.manha;

public class RotinaGuilherme extends RotinaManha{

	@Override
	protected void tomarCafeDaManha() {
		System.out.println("Tomei café café com pão, presunto e queijo");
	}

	@Override
	protected void arrumarSe() {
		System.out.println("Tomei banho, me arrumei com roupas, calcei os sapatos");
	}

	@Override
	protected void pentearCabelo() {
		System.out.println("Só penteei o cabelo");
	}

}
