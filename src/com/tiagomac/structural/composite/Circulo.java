package com.tiagomac.structural.composite;

public class Circulo extends Figura {

	@Override
	public void desenhar() {
		System.out.println("O");
		for (Figura fig : super.getFiguras()) {
			fig.desenhar();
		}
	}

}
