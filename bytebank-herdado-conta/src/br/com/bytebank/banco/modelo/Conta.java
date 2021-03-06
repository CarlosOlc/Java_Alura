package br.com.bytebank.banco.modelo;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException{
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + 
												 ", Valor: "+ valor);
		}
		this.saldo -=valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {

		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Erro");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Erro");
			return;
		}
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public static int getTotal() {
		return total;
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + 
			   " | Agencia: " + this.agencia +
			   " | Titular: "+ this.getTitular().getNome();
	}
	
	public boolean ehIgual(Conta outra) {
		if(this.agencia != outra.agencia) {
			return false;
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	
}
