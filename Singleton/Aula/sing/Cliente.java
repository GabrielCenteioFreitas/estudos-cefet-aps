package sing;

public class Cliente {

	public static void main(String[] args) {
		// Tentar criar mais de uma instância da classe singleton
		ConexaoBD i1 = ConexaoBD.getInstance();
		ConexaoBD i2 = ConexaoBD.getInstance();
		ConexaoBD i3 = ConexaoBD.getInstance();
		
			
		//Para testar:
		
		//Criar algum atributo que possa ser modificado 
		//e verificar se as variáveis estão 
		//referenciando o mesmo objeto
		i1.pegaConexao();
		i1.pegaConexao();
		i1.pegaConexao();
		i1.pegaConexao();
		i2.pegaConexao();
		
		System.out.println(i1.conexoesAtivas);
		System.out.println(i2.conexoesAtivas);
		System.out.println(i3.conexoesAtivas);
	}

}
