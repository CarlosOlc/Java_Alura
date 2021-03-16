package br.com.bytebank.banco.modelo;

public class Contas {
	private Conta[] ref;
	private int posicao;
	
	public Contas() {
		this.ref = new Conta[10];
		this.posicao = 0;
	}
	
	
	public void adiciona(Conta ref) {
		this.ref[this.posicao] = ref;
		this.posicao++;
	}
	
	public int getQuantidadeElementos() {
		return this.posicao;
	}
	
	public Conta getReferencia(int pos) {
		return this.ref[pos];
	}

}
