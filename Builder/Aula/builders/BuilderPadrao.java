package Builder.Aula.builders;

public class BuilderPadrao extends SanduicheBuilder{

	@Override
	public void montaPao(String s) {
		sanduiche.setPao(s);
	}

	@Override
	public void montaMolho(String s) {
		sanduiche.setMolho(s);
	}

	@Override
	public void montaQueijo(String tipo, int q) {
		sanduiche.setTipoQueijo(tipo);
		sanduiche.setQtdQueijo(q);
	}

	@Override
	public void montaCarne(int q) {
		sanduiche.setCarne(q);
	}

	@Override
	public void montaVegetais(int q) {
		sanduiche.setVegetais(q);
	}
	
	//...

}
