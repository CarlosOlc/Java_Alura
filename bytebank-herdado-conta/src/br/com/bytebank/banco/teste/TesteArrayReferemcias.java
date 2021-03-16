package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Contas;

public class TesteArrayReferemcias {

	public static void main(String[] args) {
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(122,32);
		ContaCorrente cc2 = new ContaCorrente(33,25);
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		contas[2] = new ContaCorrente(11,66);
		
		System.out.println(contas[2].getNumero());
		System.out.println(contas[0].getAgencia());
		
		
		Contas guardador = new Contas();
		
		guardador.adiciona(cc1);
		
		System.out.println(guardador.getQuantidadeElementos());
		
		System.out.println(guardador.getReferencia(0).getNumero());
		
		
		

	}

}
