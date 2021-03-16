package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;


public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 222);
		cc.deposita(100);
		
		SeguroVida seguro = new SeguroVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(seguro);

		
		System.out.println(calc.getTotalImposto());

	}

}
