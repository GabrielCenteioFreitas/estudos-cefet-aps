package estrategias;

public class DefaultStrategy implements IStrategy{

	@Override
	public void executar(String a, String b) {
		System.out.printf("Foi andando de %s até %s\n",
				a, b);
	}

}
