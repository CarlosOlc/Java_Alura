
public class TesteGerente {
	public static void main(String[] args) {
		
		
		Gerente gerente = new Gerente();
		gerente.setCpf("34124");
		gerente.setNome("aaa");
		gerente.setSalario(3333);
		gerente.setSenha(3333);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacao());
		if (gerente.autentica(3333))
		System.out.println("ssss");
	}
}
