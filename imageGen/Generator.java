package imageGen;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import ref.Settings;

public class Generator {
	Random rand = new Random();
	public BufferedImage generateImg(){
		BufferedImage img = new BufferedImage(Settings.imgWidth, Settings.imgHeight, BufferedImage.TYPE_INT_ARGB);
		drawSolidBackground(img, new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),255));
		img = PolyNDraw.drawPoly(0, img, new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), 255).getRGB(), 10);
		
		saveImg(img);
		return img;
	}

	private void drawSolidBackground(BufferedImage img, Color rgb) {
		for(int x = 0; x < Settings.imgWidth; x++){
			for(int y = 0; y < Settings.imgHeight; y++){
				img.setRGB(x, y, rgb.getRGB());
			}
		}
		
	}
	
	private void saveImg(BufferedImage img){
		File output = new File("PINGBG-"+ rand.nextInt(10000) + ".png");
		try {
			ImageIO.write(img, "png", output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
