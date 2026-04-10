package Flyweight.Aula.floresta;
public class TreeType implements IFlyweight { //Flyweight
	
	//atributo que ocuparia muito espaço em memória
	protected String texture; //estado intrínseco
	
	protected TreeType(String texture) {
		this.texture = texture;
	}
	
	//método draw com todos os atributos
	public void draw(String canvas, int x, int y) {
		System.out.println("Desenhando em " + canvas + 
			" árvore com textura " + texture +
			" em (" + x + "," + y + ")");
	}

	@Override
	public void draw(String canvas) {
		//O outro draw que precisa ser chamado		
	}
}
