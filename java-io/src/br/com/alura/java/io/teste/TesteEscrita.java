package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException{
//		OutputStream fis = new FileOutputStream("lorem2.txt");
//		Writer isr = new OutputStreamWriter(fis);
//		BufferedWriter br = new BufferedWriter(isr);
		
//		br.write("dbadadn");
//		br.newLine();
//		br.write("nfgnfgn");
		
//		br.close();
		
//		BufferedWriter br = new BufferedWriter(new FileWriter("lorem2.txt"));
//		br.write("OI tudo bem ?");
//		br.newLine();
//		br.write("Indo");
//		
//		br.close();
		
		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("aaaaaaa");
		ps.println("AAAAAAA");
		ps.close(); 
		
		
	}

}
