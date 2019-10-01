package com.tiagomac.structural.composite;

public class Quadrado extends Figura{

	@Override
	public void desenhar() {
		System.out.println("#");
		for (Figura fig: super.getFiguras()) {
			fig.desenhar();
		}
	}

}
