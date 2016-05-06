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
		//randRainbow(img);
		img = Shapes.drawPolarGraphX(rand.nextInt(256), rand.nextInt(256), img, new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), 255).getRGB(), rand.nextInt(1000)+360, rand.nextInt(ref.Settings.imgWidth), rand.nextInt(ref.Settings.imgHeight),rand.nextInt(20)-10);
		img = Shapes.drawPolarGamma(rand.nextInt(256), rand.nextInt(256), img, new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), 255).getRGB(), rand.nextInt(1000)+360, rand.nextInt(ref.Settings.imgWidth), rand.nextInt(ref.Settings.imgHeight),rand.nextInt(20)-10);
		img = Shapes.drawNoodles(rand.nextInt(256), rand.nextInt(256), img, new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), 255).getRGB(), rand.nextInt(1000)+360, rand.nextInt(ref.Settings.imgWidth), rand.nextInt(ref.Settings.imgHeight),rand.nextInt(20));
		img = PolyNDraw.drawPoly(0, img, new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), 255).getRGB(), 10);
		img = PolyNDraw.drawPoly(2, img, new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), 255).getRGB(), 10);
		img = PolyNDraw.drawPoly(1, img, new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),255).getRGB(), 100);
		img = PolyNDraw.drawPoly(1, img, new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),255).getRGB(), 100);
		img = PolyNDraw.drawPoly(1, img, new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),255).getRGB(), 100);
		
		
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
	
	private BufferedImage randRainbow(BufferedImage img){
		int rStart = rand.nextInt(256);
		int rando = rand.nextInt(3);
		System.out.println("Okay");
		int gStart = rand.nextInt(256);
		int bStart = rand.nextInt(256);
		for(int x = 0; x < Settings.imgWidth; x++){
			for(int y = 0; y < Settings.imgHeight; y++){
				
					if (x%10 ==0) {
						if (rando == 0) {
							if (rStart >= 250) {
								rStart = 0;
							}
							rStart++;

						} else if (rando == 1) {
							if (gStart >= 250) {
								gStart = 0;
							}
							gStart++;
						} else {
							if (bStart >= 250) {
								bStart = 0;
							}
							bStart++;
						} 
					}
				img.setRGB(x, y, new Color(rStart, gStart, bStart, 255).getRGB());
			}
		}
		return img;
	}

}
