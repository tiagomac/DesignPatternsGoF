package com.tiagomac.behavioral.strategy;

public class Main {

	public static void main(String[] args) {
		int distancia = 40;
		int opcaoFrete = 2; // (1) normal; (2) sedex.
		TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];
		
		Frete frete = tipoFrete.obterFrete();
		double preco  = frete.calcularPreco(distancia);
		System.out.println(preco);
	}

}
