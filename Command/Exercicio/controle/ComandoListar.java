package controle;

import model.Database;

public class ComandoListar implements ICommand {
	@Override
	public void execute(String... args) {
		Database database = Database.getInstance();
    System.out.println("\u001B[34m-- Lista de Clientes --");
		database.listarClientes();
    System.out.println("\u001B[0m");
	}
}