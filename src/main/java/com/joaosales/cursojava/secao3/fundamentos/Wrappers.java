package com.joaosales.cursojava.secao3.fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		//Orientação a objeto de cada tipo primitivo;

		Scanner teclado = new Scanner(System.in);

		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt(teclado.next()); // int
		Long l = 100_000L;
		
		//tipo reais 
		
		Float f = 123.45F;
		System.out.println(f);
		
		Double d = 12345.678;
		System.out.println(d);
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);

		teclado.close();
		
		Boolean bool = Boolean.parseBoolean("True");
		System.out.println(bool);
		System.out.println(bool.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "....");
	}

}
