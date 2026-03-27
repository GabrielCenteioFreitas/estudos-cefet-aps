package Builder.Aula.main;

import Builder.Aula.builders.*;

public class Cliente {

	public static void main(String[] args) {
		//Cria um diretor
		DiretorSanduiche dir = new DiretorSanduiche();
		
		//Define o builder desejado
		dir.setBuilder(new BuilderPadrao());
		
		//Cria um produto a partir do diretor, passando um pedido
		//Formato do pedido: 
		//pao, molho, tipo queijo, qtd queijo, carne, vegetais
		String pedido = "integral maionese prato 2 2 3";
		Sanduiche sanduba = dir.montaSanduiche(pedido);
		
		//Imprime o produto resultante
		System.out.println(sanduba);
		
		System.out.println("---");
		dir.setBuilder(new BuilderIncompetente());
		pedido = "italiano maioneseVerde minas 4 0 2";
		Sanduiche sanduba2 = dir.montaSanduiche(pedido);
		System.out.println(sanduba2);
	}

}
