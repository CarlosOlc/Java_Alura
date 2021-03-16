package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(new File("contas.csv"));
		
		while(scan.hasNext()) {
			String linha = scan.nextLine();
//			System.out.println(linha);
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
			
			Scanner scanLinha = new Scanner(linha);
			scanLinha.useLocale(Locale.US);
			scanLinha.useDelimiter(",");
			
			String valor1 = scanLinha.next();
			int valor2 = scanLinha.nextInt();
			int valor3 = scanLinha.nextInt();
			String valor4 = scanLinha.next();
			double valor5 = scanLinha.nextDouble();
		
			
//			System.out.println(valor1);
//			System.out.println(valor2);
//			System.out.println(valor3);
//			System.out.println(valor4);
//			System.out.println(valor5);
			
			
			String valorFormatado = String.format(Locale.GERMANY, "%s - %04d-%04d, %15s: %08.2f",
													valor1, valor2,valor3,valor4,valor5);
			System.out.println(valorFormatado);
			
			scanLinha.close();
			
		}
		
		
		scan.close();
	}

}
