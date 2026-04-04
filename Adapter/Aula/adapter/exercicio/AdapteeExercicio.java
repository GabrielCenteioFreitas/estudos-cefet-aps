package Adapter.Aula.adapter.exercicio;

public class AdapteeExercicio {

	public String felizAniversario(int datas[]) {
		//data de nascimento no formato [dia,mes,ano]
		String parabens = String.format("Hoje é %d do mês"
				+ " %d. Parabéns, "
				+ "você está fazendo %d anos de idade!",
				datas[0], datas[1], (2026-datas[2]));
		
		return parabens;
	}
}
