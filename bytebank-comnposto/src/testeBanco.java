
public class testeBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "paulo";
		paulo.cpf = "222";
		paulo.profissao = "programador";
		
		Conta conta = new Conta();
		conta.titular = paulo;
		conta.deposita(100);
		System.out.println(conta.titular.nome);
		System.out.println(conta.getSaldo());
	
	}
}
