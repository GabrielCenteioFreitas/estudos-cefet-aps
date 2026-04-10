package Mediator.Aula.jogo;

public abstract class Personagem {
	protected int vida;
	protected String nome;
	protected Mediator mediador;
	
	public Personagem(String n, Mediator m) {
		this.nome = n;
		mediador = m;
		this.vida = 10;
	}
	
	protected void perdeVida(int valor) {
		vida -= valor;
		if(vida < 0 ) {
			vida = 0;
		}
		System.out.println("Vida de " + nome + ": " + vida);
	}
	
	protected void ganhaVida(int valor) {
		vida += valor;
	}

	@Override
	public String toString() {
		return "Personagem [vida=" + vida + ", nome=" + nome + "]";
	}
}
