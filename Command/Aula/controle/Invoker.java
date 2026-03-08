package controle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Invoker {
	
	//Estrutura para armazenar os comandos
	static Map<String, ICommand> comandos = new HashMap<String, ICommand>();
	
	static Stack<ICommand> historico = new Stack<ICommand>();
	
	static {
		//Define qual chave para invocar qual comando
		 comandos.put("A", new ComandoA());
		 comandos.put("B", new ComandoB());
		 comandos.put("ComandoA", new ComandoA());
	}
	
	public static void invoke(String comando) {
		try{
			ICommand c = comandos.get(comando); // recupera comando
			// executa o comando concreto
			c.execute();
			// adiciona ao historico
			historico.push(c);
		} catch(NullPointerException e) {
			System.err.println("Comando inválido!");
		}
		
		//E se for um comando inválido?
		//Posso tratar com try-catch
	}
	
	public static void undo() {
		if(!historico.isEmpty()) {
			// Desfaz o último comando executado
			ICommand c = historico.pop();
			c.undo();
		}
	}
	
	//Como desfazer de uma só vez todos os comandos?
	//Posso criar um método que chama o undo() até a pilha esvaziar
	public static void undoAll() {
		while (!historico.isEmpty()) {
			undo();
		}
	}

}
