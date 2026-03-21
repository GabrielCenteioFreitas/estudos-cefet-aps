package estrategias;

public class MoonwalkStrategy implements IStrategy{

	@Override
	public void executar(String a, String b) {
		System.out.printf("Foi de %s até %s fazendo moonwalk\n",
				a, b);
	}

}
