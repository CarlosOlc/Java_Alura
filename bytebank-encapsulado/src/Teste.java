
public class Teste {
	public static void main(String[] args) {
		Conta conta = new Conta(0, 0);
		conta.setNumero(1333);
		System.out.println(conta.getNumero());
		Cliente carlos = new Cliente();
		
		carlos.setNome("Carlos");
		conta.setTitular(carlos);
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());

	}
}
