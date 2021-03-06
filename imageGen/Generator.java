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
		//randbow(img);
		img = Shapes.wrapper(img, rand.nextInt(10), /*radius*/10, rand.nextInt(100), /*thickness*/ 1, rand.nextInt(20), /*color*/ 1,1,1,0, rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),255, /*arclength*/ 180, rand.nextInt(1000), /*arclengthEnd*/ 360, rand.nextInt(1000),/*x*/ 1, rand.nextInt(Settings.imgWidth),/*y*/ 1, rand.nextInt(Settings.imgHeight),/*element*/ 1, rand.nextInt(20));
		img = Shapes.wrapper(img, rand.nextInt(10), /*radius*/10, rand.nextInt(100), /*thickness*/ 1, rand.nextInt(20), /*color*/ 1,1,1,0, rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),255, /*arclength*/ 180, rand.nextInt(1000), /*arclengthEnd*/ 360, rand.nextInt(1000),/*x*/ 1, rand.nextInt(Settings.imgWidth),/*y*/ 1, rand.nextInt(Settings.imgHeight),/*element*/ 1, rand.nextInt(20));
		img = Shapes.wrapper(img, rand.nextInt(10), /*radius*/10, rand.nextInt(100), /*thickness*/ 1, rand.nextInt(20),  /*color*/ 1,1,1,0, rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),255, /*arclength*/ 180, rand.nextInt(1000), /*arclengthEnd*/ 360, rand.nextInt(1000),/*x*/ 0, rand.nextInt(Settings.imgWidth),/*y*/ 0, rand.nextInt(Settings.imgHeight),/*element*/ 1, rand.nextInt(5));
		img = Shapes.wrapper(img, rand.nextInt(10), /*radius*/10, rand.nextInt(100), /*thickness*/ 1, rand.nextInt(20),  /*color*/ 1,1,1,0, rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),255, /*arclength*/ 180, rand.nextInt(1000), /*arclengthEnd*/ 360, rand.nextInt(1000),/*x*/ 0, rand.nextInt(Settings.imgWidth),/*y*/ 0, rand.nextInt(Settings.imgHeight),/*element*/ 1, rand.nextInt(5));
		img = Shapes.wrapper(img, rand.nextInt(10), /*radius*/10, rand.nextInt(100), /*thickness*/ 1, rand.nextInt(20),  /*color*/ 1,1,1,0, rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),255, /*arclength*/ 180, rand.nextInt(1000), /*arclengthEnd*/ 360, rand.nextInt(1000),/*x*/ 0, rand.nextInt(Settings.imgWidth),/*y*/ 0, rand.nextInt(Settings.imgHeight),/*element*/ 1, rand.nextInt(5));
		img = Shapes.wrapper(img, rand.nextInt(7), /*radius*/10, rand.nextInt(100), /*thickness*/ 1, rand.nextInt(20),  /*color*/ 1,1,1,0, rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),255, /*arclength*/ 180, rand.nextInt(1000), /*arclengthEnd*/ 360, rand.nextInt(1000),/*x*/ 0, rand.nextInt(Settings.imgWidth),/*y*/ 0, rand.nextInt(Settings.imgHeight),/*element*/ 1, rand.nextInt(5));
		img = Shapes.wrapper(img, rand.nextInt(7), /*radius*/10, rand.nextInt(100), /*thickness*/ 1, rand.nextInt(20),  /*color*/ 1,1,1,0, rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),255, /*arclength*/ 180, rand.nextInt(1000), /*arclengthEnd*/ 360, rand.nextInt(1000),/*x*/ 0, rand.nextInt(Settings.imgWidth),/*y*/ 0, rand.nextInt(Settings.imgHeight),/*element*/ 1, rand.nextInt(5));
		img = Shapes.wrapper(img, rand.nextInt(7), /*radius*/10, rand.nextInt(100), /*thickness*/ 1, rand.nextInt(20),  /*color*/ 1,1,1,0, rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),255, /*arclength*/ 180, rand.nextInt(1000), /*arclengthEnd*/ 360, rand.nextInt(1000),/*x*/ 0, rand.nextInt(Settings.imgWidth),/*y*/ 0, rand.nextInt(Settings.imgHeight),/*element*/ 1, rand.nextInt(5));
		img = Shapes.wrapper(img, rand.nextInt(7), /*radius*/10, rand.nextInt(100), /*thickness*/ 1, rand.nextInt(20),  /*color*/ 1,1,1,0, rand.nextInt(256),rand.nextInt(256),rand.nextInt(256),255, /*arclength*/ 180, rand.nextInt(1000), /*arclengthEnd*/ 360, rand.nextInt(1000),/*x*/ 0, rand.nextInt(Settings.imgWidth),/*y*/ 0, rand.nextInt(Settings.imgHeight),/*element*/ 1, rand.nextInt(5));
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
	//See what I did there. rand Rainbow -> randbow??? LOL
	private BufferedImage randbow(BufferedImage img){
		int rStart = rand.nextInt(256);
		int rando = rand.nextInt(3);
		//System.out.println("Okay"); /*I see you...*/
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
