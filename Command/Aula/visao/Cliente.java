package visao;
import controle.Invoker;

public class Cliente {

	public static void main(String[] args) {
		// Invoca comandos a partir do Invoke
		Invoker.invoke("A");
		Invoker.invoke("ComandoA");
		Invoker.invoke("B");
		Invoker.invoke("C");
		
		// Desfaz comandos
		Invoker.undo();
		Invoker.undo();
		Invoker.undo();
		
		
		//Como desfazer de uma só vez todos os comandos?
		Invoker.undoAll();
	}

	
	
	
	
	
	
	
	
	
	
	// Pergunta: 
	// Como podemos facilitar a execução de chamadas
	// ao contrário? 

	// Podemos criar um método para desfazer todo o histórico, 
	// na ordem inversa de execução?
	
}
