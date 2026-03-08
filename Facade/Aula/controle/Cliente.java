package controle;

public class Cliente {

	public static void main(String[] args) {
		//Chama algum metodo da classe de servico
		//para executar algo ou obter alguma informacao
		AlunoService.buscarAlunoId(1);
		AlunoService.buscarAlunoId(2);
		
		AlunoService.buscarAlunoNome("Aluno do id 1");
		AlunoService.buscarAlunoNome("Aluno do id 2");
	}

}
