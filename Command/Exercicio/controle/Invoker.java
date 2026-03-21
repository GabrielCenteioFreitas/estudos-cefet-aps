package Command.Exercicio.controle;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Invoker {
	static Map<String, ICommand> comandos = new HashMap<String, ICommand>();
	
	static Stack<ICommand> historico = new Stack<ICommand>();
	
	static {
		comandos.put("Incluir Cliente", new ComandoIncluir());
		comandos.put("Alterar Cliente", new ComandoAlterar());
		comandos.put("Excluir Cliente", new ComandoExcluir());
		comandos.put("Listar Clientes", new ComandoListar());
	}
	
	public static void invoke(String comando, String... args) {
		try{
			ICommand c = comandos.get(comando);
			c.execute(args);
			historico.push(c);
		} catch(NullPointerException e) {
			System.err.println("Comando inválido!");
		}
	}
}
