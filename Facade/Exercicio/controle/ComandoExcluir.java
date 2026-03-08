package controle;

import model.ModelFacade;

public class ComandoExcluir implements ICommand {
	@Override
	public void execute(String... args) {
    ModelFacade modelFacade = ModelFacade.getInstance();
    try {
		  modelFacade.excluirCliente(Long.parseLong(args[0]));
      System.out.println("\u001B[32mCliente " + args[0] + " excluído com sucesso!\u001B[0m\n");
    } catch (Exception e) {
      System.err.println("\u001B[31mArgumentos inválidos!\u001B[0m\n");
    }
	}
}