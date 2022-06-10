package com.joaosales.cursojava.secao3.fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal!".charAt(4));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "!!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Joao";
		var sobrenome = "Sales";
		var idade = 27;
		var salario = 1400.01;
		
		System.out.println("Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade + 
				"\nSalario: " + salario + "\n\n" );
		
		System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}

}
