package com.joaosales.cursojava.secao3.fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		double a = 1; //convers�o impl�cita;
		System.out.println(a);
		
		float b = (float) 1.12345678888888; // Expl�cita (cast)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // Expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; // Expl�cita (CAST)
		System.out.println(f);

	}

}
