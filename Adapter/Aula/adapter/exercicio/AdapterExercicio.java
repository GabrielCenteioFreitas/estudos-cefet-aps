package Adapter.Aula.adapter.exercicio;

public class AdapterExercicio implements TargetExercicio {
	
	private AdapteeExercicio adaptee;
	
	public AdapterExercicio(AdapteeExercicio a) {
		this.adaptee = a;
	}
	
	@Override
	public String darParabens(String dataString) {
		// string no formato ano-mes-dia
		// adaptee usa int[dia,mes,ano]
		int[] datas = new int[3];
		String[] separados = dataString.split("-");
		for (int i = 0; i < 3; i++) {
			datas[i] = Integer.parseInt(separados[2-i]);
		}
		return adaptee.felizAniversario(datas);
	}

}
