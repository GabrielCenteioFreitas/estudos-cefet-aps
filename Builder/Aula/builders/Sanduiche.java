package Builder.Aula.builders;

public class Sanduiche {
	//Métodos que permitem definir os atributos do produto
	//Exemplo: pao, molho, queijo, carne, vegetais;
	
	private String pao, molho, tipoQueijo;
	
	private int qtdQueijo, carne, vegetais;

	public void setPao(String pao) {
		this.pao = pao;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	public void setTipoQueijo(String tipoQueijo) {
		this.tipoQueijo = tipoQueijo;
	}

	public void setQtdQueijo(int qtdQueijo) {
		this.qtdQueijo = qtdQueijo;
	}

	public void setCarne(int carne) {
		this.carne = carne;
	}

	public void setVegetais(int vegetais) {
		this.vegetais = vegetais;
	}

	@Override
	public String toString() {
		return "Sanduiche [pao=" + pao + ", molho=" + molho + ", "
				+ "tipo queijo=" + tipoQueijo + ", "
				+ "qtdQueijo=" + qtdQueijo + ", carne=" + carne + ", "
				+ "vegetais=" + vegetais + "]";
	}
	
}
