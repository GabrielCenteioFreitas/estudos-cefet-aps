import estrategias.*;

public class Cliente {

	public static void main(String[] args) {
		//Cliente cria contexto
		Contexto contexto = new Contexto();
		
		//Define e executa a estratégia que quiser
		contexto.executar("Sala 3", "Entrada do CEFET");
		
		//Pode alterar a estratégia e executar novamento
		contexto.setEstrategia(new MoonwalkStrategy());
		contexto.executar("Entrada do CEFET", "Estação de trem");
		
		contexto.setEstrategia(new CorrendoStrategy());
		contexto.executar("Estação de trem", "Trem");
		
	}

}
