package Adapter.Aula.adapter.main;
import Adapter.Aula.adapter.exercicio.*;
import Adapter.Aula.adapter.implementacoes.*;

public class Cliente {

	public static void main(String[] args) {
		
		//Testar as duas implementações
		//Cliente cria objeto adapter e invoca seu método request
		Target adaptadorHeranca = new AdapterHeranca();
		adaptadorHeranca.request();
		System.out.println("---");
		Target adaptadorReferencia =
				new AdapterReferencia(new Adaptee());
		adaptadorReferencia.request();
		
		System.out.println("---Exercício---");
		String ruan = "2006-04-27";
		TargetExercicio adapter = 
				new AdapterExercicio(new AdapteeExercicio());
		String mensagem = adapter.darParabens(ruan);
		System.out.println(mensagem);
	}

}
