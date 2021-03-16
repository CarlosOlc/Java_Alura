
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saldo);
		
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		contaMarcela.transfere(500, conta);
		System.out.println("saldo conta = " + conta.saldo);
		System.out.println("saldo Marcela = " + contaMarcela.saldo);
 	}
}
