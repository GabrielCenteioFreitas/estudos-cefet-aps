package AbstractFactory.Aula.fabrica;

import AbstractFactory.Aula.produtos.*;

public class MoveisMedievalFactory extends MoveisFactory {

	@Override
	protected ICadeira criaCadeira() {
		return new CadeiraMedieval();
	}

	@Override
	protected IPoltrona criaPoltrona() {
		return new PoltronaMedieval();
	}

}
