
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1231,4141);
		System.out.println(conta.getAgencia() +"\n"+ 
							conta.getNumero());
		Conta conta2 = new Conta(1231,4141);
		System.out.println(Conta.getTotal());
	}
}
