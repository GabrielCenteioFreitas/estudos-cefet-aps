package Strategy.Aula.estrategias;

public class RolandoStrategy implements IStrategy{

	@Override
	public void executar(String a, String b) {
		System.out.printf("Foi rolando de %s até %s\n",
				a, b);
	}

}
