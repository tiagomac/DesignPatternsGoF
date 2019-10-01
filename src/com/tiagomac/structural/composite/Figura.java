package com.tiagomac.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Figura {
	
	private List<Figura> figuras;
	
	public Figura() {
		this.figuras = new ArrayList<>();
	}
	
	public abstract void desenhar();
	
	public void adicionarFigura(Figura figura) {
		this.figuras.add(figura);
	}

	public List<Figura> getFiguras() {
		return figuras;
	}

	public void setFiguras(List<Figura> figuras) {
		this.figuras = figuras;
	};

}
