package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		super.saca(valor + 0.2);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;

	}

	@Override
	public double getvalorImposto() {
		return super.saldo * 0.01;
	}
	@Override
	public String toString() {
		return super.toString();
	}

}
