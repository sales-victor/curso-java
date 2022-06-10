package com.joaosales.cursojava.secao3.fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informa��es do funcion�rios
		
		//Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3234845345L;
		
		// tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipos booleanos
		boolean estaDeFerias = false; //true
		
		//tipo caractere
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365 );
		
		//n�mero de viagens 
		System.out.println(numerosDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha --->" + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);

	}

}
