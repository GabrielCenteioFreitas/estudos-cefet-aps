package controle;

import model.ModelFacade;

public class ComandoAlterar implements ICommand {
	@Override
	public void execute(String... args) {
    ModelFacade modelFacade = ModelFacade.getInstance();
    try {
			modelFacade.alterarCliente(Long.parseLong(args[0]), Long.parseLong(args[1]), args[2]);
      System.out.println("\u001B[32mCliente alterado com sucesso!\u001B[0m\n");
    } catch (Exception e) {
      System.err.println("\u001B[31mArgumentos inválidos!\u001B[0m\n");
    }
	}
}