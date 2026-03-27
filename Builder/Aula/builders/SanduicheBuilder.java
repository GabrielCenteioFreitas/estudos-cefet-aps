package Builder.Aula.builders;

public abstract class SanduicheBuilder {
	
	//Produto que o builder monta
	protected Sanduiche sanduiche;
	//Exemplo: pao, molho, tipo queijo, qtd queijo, carne, vegetais;
	
	//Início do processo
	public void inicia() {
		this.sanduiche = new Sanduiche();
	}
	
	//Métodos que todo builder concreto deve implementar à sua maneira
	//Criar os builders concretos
	public abstract void montaPao(String s);
	
	public abstract void montaMolho(String s);
	
	public abstract void montaQueijo(String tipo, int q);
	
	public abstract void montaCarne(int q);
	
	public abstract void montaVegetais(int q);
	
	//Finalização do processo
	//Retorna produto final
	public Sanduiche getResult() {
		return sanduiche;
	}
	
	//Criar os builders concretos
}
