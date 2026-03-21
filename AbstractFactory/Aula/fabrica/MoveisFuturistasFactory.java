package AbstractFactory.Aula.fabrica;

import AbstractFactory.Aula.produtos.*;

public class MoveisFuturistasFactory extends MoveisFactory {

	@Override
	protected ICadeira criaCadeira() {
		return new CadeiraFuturista();
	}

	@Override
	protected IPoltrona criaPoltrona() {
		return new PoltronaFuturista();
	}

}
