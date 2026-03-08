package sing;

//Esta classe é um Singleton
public class ConexaoBD {
	
	public int conexoesAtivas;
	
	private static ConexaoBD instancia;
	
	//Único construtor, mantendo privado
	private ConexaoBD() {
		conexoesAtivas = 0;
	}
	
	//Garante o retorno da instância única
	public static ConexaoBD getInstance() {
		if(instancia == null) {
			instancia = new ConexaoBD();
		}
		return instancia;
	}
	
	public void pegaConexao() {
		conexoesAtivas++;
	}
}
