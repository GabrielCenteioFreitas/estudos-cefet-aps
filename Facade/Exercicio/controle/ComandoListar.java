package controle;

import model.ModelFacade;

public class ComandoListar implements ICommand {
	@Override
	public void execute(String... args) {
		ModelFacade modelFacade = ModelFacade.getInstance();
    System.out.println("\u001B[34m-- Lista de Clientes --");
		modelFacade.listarClientes();
    System.out.println("\u001B[0m");
	}
}