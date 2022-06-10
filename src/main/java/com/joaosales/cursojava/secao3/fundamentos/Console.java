package com.joaosales.cursojava.secao3.fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("bom");
		
		System.out.println("\ndia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d", 1,2,3,4,5,6);
		
		System.out.printf("\nSalario: %.2f\n\n", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Usuário logado: " + nome +" "+ sobrenome + ", " + idade + " de idade.");
		
		entrada.close();
	}
}
