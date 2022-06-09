package com.joaosales.cursojava.secao3.fundamentos;


public class Temperatura {

	public static void main(String[] args) {
		final double AJUSTE = 32;
		final double MULTIPLICADOR = 5.0/9.0;
		
		double fahrenheit = 150;
		double celcius = (fahrenheit - AJUSTE) * MULTIPLICADOR;
		System.out.println("O resultado é " + celcius+"ºC.");
		
		fahrenheit = 80;
		celcius = (fahrenheit - AJUSTE) * MULTIPLICADOR;
		System.out.println("O resultado é " + celcius+"ºC.");
	}

}
