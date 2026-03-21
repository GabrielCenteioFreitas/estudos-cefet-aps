package TemplateMethod.Aula.rotina.manha;

public abstract class RotinaManha //classe com definição do Template Method
{
	//Pode conter atributos que os métodos utilizam
	
	//Métodos que as classes concretas devem implementar
	//Pode ou não ter métodos concretos, que as subclasses
	//usam ou sobrescrevem
	protected void acordar(int horas) {
		System.out.println("Acordei às " + horas + " horas");
	}
	
	protected abstract void tomarCafeDaManha();
	
	protected abstract void arrumarSe();
	
	protected abstract void pentearCabelo();
	
	protected void escovarDentes() {
		System.out.println("Escovei os dentes");
	}
	

	public void templateMethod(int horas) {
		//Template da rotina da manhã
		//Como os métodos são executados
		acordar(horas);
		tomarCafeDaManha();
		escovarDentes();
		arrumarSe();
		if(horas <= 10) {
			pentearCabelo();
		}
	}
	
	//Criar as classes concretas que implementam
	//as etapas do Template Method
}
