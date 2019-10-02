package com.tiagomac.behavioral.templatemethod;

public class Main {

	public static void main(String[] args) {
		
		Player tocador = new Mp3Player();
		tocador.executar();
		
		System.out.println();
		
		tocador = new WmvPlayer();
		tocador.executar();
	}

}
