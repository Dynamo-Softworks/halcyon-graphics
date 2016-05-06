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
		}else if(num == 1){
			int bWid = rand.nextInt(Settings.imgWidth/8);
			int bHei = rand.nextInt(Settings.imgHeight/8);
			int xStart = rand.nextInt(Settings.imgWidth);
			int yStart = rand.nextInt(Settings.imgHeight);
			
			for(int x = xStart; x < bWid + xStart; x++){
				if( x < Settings.imgWidth){
					img.setRGB(x, yStart, color);
					if(yStart + bHei < Settings.imgHeight){
						img.setRGB(x, yStart + bHei, color);
					}
				}
				
			}
			for(int y = yStart; y < (yStart + bHei); y++){
				if(y < Settings.imgHeight){
					img.setRGB(xStart, y, color);
					if(bWid + xStart < Settings.imgWidth){
						img.setRGB(xStart + bWid, y, color);
					}
				}
			}
			if((xStart + bWid/2) < Settings.imgWidth && (yStart + bHei/2) < Settings.imgHeight){
							img.setRGB((xStart + bWid/2), (yStart + bHei/2), color);
			}
			
			if(xStart + bWid/2 < Settings.imgWidth){
				for(int y = 0; y < Settings.imgHeight; y++){
					img.setRGB(xStart + bWid/2, y, color);
				}
			}
			
			if(yStart + bHei/2 < Settings.imgHeight){
				for(int x = 0; x < Settings.imgWidth; x++){
					img.setRGB(x, yStart + bHei/2, color);
				}
			}

			return img;
		}else if(num == 2){
			int cVal = rand.nextInt(Settings.imgHeight);
			for(int x = 0; x < Settings.imgWidth; x++){
				int y = (int) (100*Math.sin(x) + cVal);
				if(y < Settings.imgHeight && y >= 0){
					for(int locX = 0; locX < radius * Math.cos(x); locX++){
						for(int locY = 0; locY < radius * Math.cos(x); locY++){
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
