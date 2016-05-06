package main;

import imageGen.Generator;

public class Main {
	public static Generator gen;
	public static void main(String[] args) {
		GUIMAIN gui = new GUIMAIN();
		gui.createUI();
		gen = new Generator();
		//for(int x = 0; x < Settings.numberToGen; x++){
			//gen.generateImg();
		//}
		

	}

}
