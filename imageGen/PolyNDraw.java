package imageGen;

import java.awt.image.BufferedImage;
import java.util.Random;

import ref.Settings;

public class PolyNDraw {
	static Random rand = new Random();
	public static BufferedImage drawPoly(int num, BufferedImage img, int color, int radius){
		if(num == 0){
			int cVal = rand.nextInt(Settings.imgHeight);
			for(int x = 0; x < Settings.imgWidth; x++){
				int y = (int) (100*Math.sin(x) + cVal);
				if(y < Settings.imgHeight && y >= 0){
					for(int locX = 0; locX < radius * Math.cos(x); locX++){
						for(int locY = 0; locY < radius * Math.cos(y); locY++){
							boolean xCheck = false;
							boolean yCheck = false;
							boolean inXCheck = false;
							boolean inYCheck = false;
							if( x + locX < Settings.imgWidth){
								xCheck = true;
							}
							if( x - locX >= 0){
								inXCheck = true;
							}
							if( y + locY < Settings.imgHeight){
								yCheck = true;
							}
							if(y - locY >= 0){
								inYCheck = true;
							}
							if(xCheck && yCheck){
								img.setRGB(x + locX, y + locY, color);
							}
							if(xCheck && inYCheck){
								img.setRGB(x + locX, y - locY, color);
							}
							if(inXCheck && yCheck){
								img.setRGB(x - locX, y + locY, color);
							}
							if(inXCheck && inYCheck){
								img.setRGB(x - locX, y - locY, color);
							}
						}
					}
				}
			}
			return img;
		}else{
			return img;
		}
	}
}
