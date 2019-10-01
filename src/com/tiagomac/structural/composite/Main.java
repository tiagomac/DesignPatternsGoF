package com.tiagomac.structural.composite;

public class Main {
	
	public static void main(String[] args) {
		Figura figura = new Quadrado();
		figura.adicionarFigura(new Quadrado());
		figura.adicionarFigura(new Circulo());
		figura.adicionarFigura(new Circulo());
		figura.desenhar();
		System.out.println("\n");
	}

}
