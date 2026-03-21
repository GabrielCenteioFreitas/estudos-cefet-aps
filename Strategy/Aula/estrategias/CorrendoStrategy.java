package estrategias;

public class CorrendoStrategy implements IStrategy{

	@Override
	public void executar(String a, String b) {
		System.out.printf("Saiu correndo de %s até %s\n",
				a, b);
	}

}
