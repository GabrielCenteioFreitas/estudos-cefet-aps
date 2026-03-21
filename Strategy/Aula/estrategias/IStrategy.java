package Strategy.Aula.estrategias;

//Definição das estratégias para ir do ponto A ao B
public interface IStrategy {
	
	public void executar(String a, String b);
	
}

//Criar diferentes classes de estratégias concretas