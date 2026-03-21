package Singleton.Exercicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import Command.Aula.controle.*;

public class Invoker {
	private static Invoker instancia;
	
	static Map<String, ICommand> comandos = new HashMap<String, ICommand>();
	static Stack<ICommand> historico = new Stack<ICommand>();
	
	static {
		comandos.put("A", new ComandoA());
		comandos.put("B", new ComandoB());
		comandos.put("ComandoA", new ComandoA());
	}

	private Invoker() {}
	
	public static Invoker getInstance() {
		if(instancia == null) {
			instancia = new Invoker();
		}

		return instancia;
	}

	public void invoke(String comando) {
		try{
			ICommand c = comandos.get(comando);
			c.execute();
			historico.push(c);
		} catch(NullPointerException e) {
			System.err.println("Comando inválido!");
		}
	}
	
	public void undo() {
		if(!historico.isEmpty()) {
			ICommand c = historico.pop();
			c.undo();
		}
	}
	
	public void undoAll() {
		while (!historico.isEmpty()) {
			undo();
		}
	}
}
