
public class testeRefencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 500;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(segundaConta.saldo);
	}
}
