package Builder.Aula.builders;

public class BuilderIncompetente extends SanduicheBuilder{

	@Override
	public void montaPao(String s) {
		sanduiche.setPao(s);
	}

	@Override
	public void montaMolho(String s) {
		sanduiche.setMolho("sem molho");
	}

	@Override
	public void montaQueijo(String tipo, int q) {
		sanduiche.setTipoQueijo(tipo);
		sanduiche.setQtdQueijo(q-1);
	}

	@Override
	public void montaCarne(int q) {
		sanduiche.setCarne(q+1);
		System.out.println("carne estragada");
	}

	@Override
	public void montaVegetais(int q) {
		sanduiche.setVegetais(q);
		System.out.println("vegetais não foram lavados");
	}
	
	//...

}
