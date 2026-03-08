package model;

import java.util.ArrayList;
import java.util.List;

public class Database {
  private static Database instancia;
  private List<Cliente> clientes = new ArrayList<>();

  private Database() {}

  public static Database getInstance() {
    if (instancia == null) {
      instancia = new Database();
    }

    return instancia;
  }

  public void incluirCliente(long id, String nome) {
    Cliente cliente = new Cliente(id, nome);
    clientes.add(cliente);
  }

  public void alterarCliente(long id, long novoId, String novoNome) {
    for (Cliente cliente : clientes) {
      if (cliente.getId() == id) {
        cliente.setId(novoId);
        cliente.setNome(novoNome);
        return;
      }
    }

    throw new IllegalArgumentException("Cliente não encontrado com ID: " + id);
  }

  public void excluirCliente(long id) {
    boolean encontrado = clientes.removeIf((cliente) -> cliente.getId() == id);
    if (!encontrado) {
      throw new IllegalArgumentException("Cliente não encontrado com ID: " + id);
    }
  }

  public void listarClientes() {
    for (Cliente cliente : clientes) {
      System.out.println(cliente);
    }
  }
}
