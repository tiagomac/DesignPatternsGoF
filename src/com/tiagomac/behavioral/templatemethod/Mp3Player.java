package com.tiagomac.behavioral.templatemethod;

public class Mp3Player extends Player {

	@Override
	public void play() {
		System.out.println("Executando um audio MP3...");
	}

	@Override
	public void stop() {
		System.out.println("Parando um audio MP3...");
	}

	@Override
	public void avancar() {
		System.out.println("Avançando um audio MP3...");
	}

}
