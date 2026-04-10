package ChainOfResponsability.Aula.main;
import ChainOfResponsability.Aula.empresa.*;

public class Cliente {

	public static void main(String[] args) {
		
		//Cria a hierarquia desejada
		//Ex: gerente, coordenador, analista
		Funcionario gerente = new Gerente(null);
		Funcionario coordenador = new Coordenador(gerente);
		Funcionario analista = new Analista(coordenador);
		
		//Invocar método a partir do último criado
		//ou a partir do ponto que desejar
		//analista.executar();
		//analista.coordenar();
		//analista.gerenciar();
		//coordenador.gerenciar();
		coordenador.executar();
		

		
		
		//OBS:
		//Cuidado com raiz da hierarquia (não tem para quem repassar)
		//Exceção pode ser tratada na classe abstrata
		//Ou a raiz da hierarquia pode implementar todos os métodos
	}

}
