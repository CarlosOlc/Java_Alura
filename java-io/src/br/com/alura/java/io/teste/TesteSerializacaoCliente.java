package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

//		Cliente cliente = new Cliente();
//		cliente.setNome("Carlos");
//		cliente.setProfissao("dev");
//		cliente.setCpf("1414131");
//		
//		
//		String nome = "Carlos";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente nome = (Cliente) ois.readObject();
		
		System.out.println(nome.getNome());
		
	}

}
