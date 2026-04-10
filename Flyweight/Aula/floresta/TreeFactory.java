package Flyweight.Aula.floresta;

import java.util.ArrayList;
import java.util.List;

public class TreeFactory {
	//Guarda uma lista com todos os TreeType já feitos
	private static List<TreeType> listaTipos = new ArrayList<TreeType>();
	
	public static TreeType getTreeType(String texture) {
		//Método que garante a unicidade do Flyweight
		
		//Funciona como um Singleton.
		//Percorre a lista e retorna.
		//Se não houver cria um novo e retorna.
		for (TreeType treeType : listaTipos) {
			if(texture.equals(treeType.texture)) {
				return treeType;
			}
		}
		TreeType tt = new TreeType(texture);
		listaTipos.add(tt);
		return tt;
	}
	
	public static int getListaSize() {
		return listaTipos.size();
	}
}
