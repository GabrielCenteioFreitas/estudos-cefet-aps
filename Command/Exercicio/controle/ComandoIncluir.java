package controle;

import model.Database;

public class ComandoIncluir implements ICommand {
	@Override
	public void execute(String... args) {
		Database database = Database.getInstance();
    try {
			database.incluirCliente(Long.parseLong(args[0]), args[1]);
    	System.out.println("\u001B[32mCliente " + args[0] + " incluído com sucesso!\u001B[0m\n");
    } catch (Exception e) {
      System.err.println("\u001B[31mArgumentos inválidos!\u001B[0m\n");
    }
	}
}