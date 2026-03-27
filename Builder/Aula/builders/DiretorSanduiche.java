package Builder.Aula.builders;

public class DiretorSanduiche {
	
	//Referência para o builder que será utilizado
	SanduicheBuilder builder;
	
	//Método para definir o builder
	//(ou define no construtor)
	public void setBuilder(SanduicheBuilder b) {
		builder = b;
	}
	
	//Método da montagem
	public Sanduiche montaSanduiche(String pedido) {
		//pedido vem na ordem:
		//pao molho tipoQueijo qtdQueijos carnes vegetais
		//Ex. de pedido: "integral barbecue cheddar 4 2 3"
		
		//Chama os métodos do builders para montagem
		builder.inicia();
		
		String[] ingredientes = pedido.split(" ");
		
		builder.montaPao(ingredientes[0]);
		builder.montaMolho(ingredientes[1]);
		builder.montaQueijo(ingredientes[2], 
				Integer.parseInt(ingredientes[3]));
		builder.montaCarne(Integer.parseInt(ingredientes[4]));
		builder.montaVegetais(Integer.parseInt(ingredientes[5]));

		//returna método do builder que retorna produto final
		return builder.getResult();
	}
	
	//Poderia haver outros métodos que variam
	//a recepção do pedido e/ou montagem
}
