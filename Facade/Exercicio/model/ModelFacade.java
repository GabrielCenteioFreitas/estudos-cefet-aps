package model;

public class ModelFacade {
  private static ModelFacade instancia;

  private ModelFacade() {}

  public static ModelFacade getInstance() {
    if (instancia == null) {
      instancia = new ModelFacade();
    }

    return instancia;
  }

  public void incluirCliente(long id, String nome) {
		Database.incluirCliente(id, nome);
  }

  public void alterarCliente(long id, long novoId, String novoNome) {
		Database.alterarCliente(id, novoId, novoNome);
  }

  public void excluirCliente(long id) {
		Database.excluirCliente(id);
  }

  public void listarClientes() {
		Database.listarClientes();
  }
}
