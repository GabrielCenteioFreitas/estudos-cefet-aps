package Mediator.Aula.jogo;

public class Heroi extends Personagem {
	
	private int forca = 3;
	
	public Heroi(String n, Mediator m) {
		super(n, m);
	}
	
	//Chama o atacar do mediador
	public void atacar(int idInimigo, int valor) {
		Personagem ini = mediador.inimigos.get(idInimigo);
		mediador.atacar(this, ini, (valor+forca));
	}
	
}
