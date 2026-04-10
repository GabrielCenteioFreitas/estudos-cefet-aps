package Mediator.Aula.jogo;
import java.util.ArrayList;
import java.util.List;

public class Mediator {
	
	//Coleção de inimigos
	protected List<Personagem> inimigos = new ArrayList<Personagem>();
	
	//Deve haver uma forma de adicionar inimigos na coleção
	//ou já inicia com uma quantidade pré-definida
	public void prepararBatalha(int quant) {
		for (int i = 1; i <= quant; i++) {
			inimigos.add(new Inimigo("Inimigo " + i, this));
		}
	}
	
	//personagem A ataca personagem B com força C
	public void atacar(Personagem p1, Personagem p2, int valor) {
		//Imprime "A atacou B e tirou C de sua vida"
		p2.perdeVida(valor);
		System.out.println(p1.nome + " atacou " + p2.nome +
			" e tirou de sua vida o valor " + valor);
	}
	
	//Opcional
	//Método para imprimir os dados da coleção de inimigos
	public void imprimeStatus() {
		for (Personagem p : inimigos) {
			System.out.println(p.toString());
		}
	}
	
}
