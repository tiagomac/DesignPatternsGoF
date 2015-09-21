package com.tiagomac.creation.builder;

import java.awt.Color;
import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		StreetMap map = new StreetMap.Builder(new Point(50, 50), new Point(100,
				100)).landColor(Color.GRAY).waterColor(Color.BLUE.brighter())
				.build();
	}

}
