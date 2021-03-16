
public class SistamaInterno {
	private int senha = 2222;
	
	public void autentica(Autenticavel g) {
		boolean a = g.autentica(this.senha);
		if (a) {
			System.out.println("ACERTOU");
		}else {
			System.out.println("errou");
		}
	}
}
