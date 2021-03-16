package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteUtil {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		
		ContaCorrente cc1 = new ContaCorrente(122,32);
		ContaCorrente cc2 = new ContaCorrente(33,25);
		ContaCorrente cc3 = new ContaCorrente(463,31);
		ContaCorrente cc4 = new ContaCorrente(7433,51);
		ContaCorrente cc5 = new ContaCorrente(122,32);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		System.out.println("Numero: " + lista.get(0).getNumero());
		
//		lista.remove(0);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("-----");
		
		for(Conta orefObject : lista) {
			System.out.println(orefObject);
		}
		
		
		System.out.println(lista.contains(cc1));
		if(lista.get(0).ehIgual(cc5)) {
			System.out.println("Agencia e Numero =");
		}
		

	}

}
