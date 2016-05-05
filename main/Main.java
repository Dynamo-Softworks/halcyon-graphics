package main;

import imageGen.Generator;
import ref.Settings;

public class Main {

	public static void main(String[] args) {
		Generator gen = new Generator();
		for(int x = 0; x < Settings.numberToGen; x++){
			gen.generateImg();
		}
		

	}

}
