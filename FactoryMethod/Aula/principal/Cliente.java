package FactoryMethod.Aula.principal;

import FactoryMethod.Aula.factorymethod.*;

public class Cliente {

	public static void main(String[] args) {
		//Cria logística concreta da fábrica desejada 
		//e invoca o método de plano de entrega
		Logistica log = new MotoFabrica();
		log.realizaEntrega();
		
		//Também pode chamar o Factory Method diretamente
		log = new TremFabrica();
		ITransporte t = log.criaTransporte();
		t.entrega();
		
		
		// Pergunta: E se quisermos criar uma nova fábrica
		// de produto para integrar com a logística atual?
		// Como fazer?
		//Criar o novo tipo de produto e sua fábrica
		//correspondente
		log = new DiscoVoadorFabrica();
		log.realizaEntrega();
		
	}

}
