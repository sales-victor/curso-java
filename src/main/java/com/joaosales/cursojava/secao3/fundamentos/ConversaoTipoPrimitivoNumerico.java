package com.joaosales.cursojava.secao3.fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		double a = 1; //conversão implícita;
		System.out.println(a);
		
		float b = (float) 1.12345678888888; // Explícita (cast)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // Explícita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; // Explícita (CAST)
		System.out.println(f);

	}

}
