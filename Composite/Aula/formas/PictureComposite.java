package Composite.Aula.formas;
import java.util.ArrayList;
import java.util.List;

public class PictureComposite extends Graphic{
	
	//Atributo privado para manter a
	//Lista de filhos (children)
	List<Graphic> lista = new ArrayList<Graphic>();
	
	//Método para adicionar filhos
	public void add(Graphic g) {
		lista.add(g);
	}
	
	//Método para remover filhos
	public void remove(Graphic g) {
		lista.remove(g);
	}
	
	//Método draw() invoca o método draw() de todos os
	//seus filhos
	public void draw() {
		for (Graphic g : lista) {
			g.draw();
		}
	}

}
