package Flyweight.Aula.floresta;

public class Tree implements IFlyweight {
	
	private int x, y; //estados extrínsecos (são "leves")
	
	private TreeType type; //referência para o Flyweight que contém o
						   //estado intrínseco (atributo "pesado", que é compartilhado)
	
	public Tree(int x, int y, String texture) {
		// instancia atributos
		// obtém type a partir da fábrica
		this.x = x;
		this.y = y;
		this.type = TreeFactory.getTreeType(texture);
	}
	
	public void draw(String canvas) {
		//pode chamar draw mais completo 
		//de TreeType
		type.draw(canvas, x, y);
	}
}
