package imageGen;

import java.awt.image.BufferedImage;
import java.util.Random;

import ref.Settings;

public class Shapes{
	public static BufferedImage drawNebula(int radius, int thickness, BufferedImage img, int color, int arclength, int centerX, int centerY, int elementSize){
		int i=0;
		int theta=0;
		int x=500;
		int y=500;
		int localThickness=0;
		while(localThickness<thickness){
			
			while(theta<arclength){
				
				x=(int)(radius*(Math.cos(degToRad(theta)))+centerX);
				y=(int)(radius*(Math.sin(degToRad(theta)))+centerY);	
				int inside=(0-elementSize);
				int outside=(0-elementSize);
				while(outside<elementSize){
					while(inside<elementSize){
						img.setRGB(x+(int)(inside*Math.cos(x)), y+(int)(outside*Math.cos(y)), color);
						inside++;
					}
					inside=0-elementSize;
					outside++;
				}
				
				
				
				theta++;
				
			}
			
			theta=0;
			radius++;
			localThickness++;
		}
		
		
		
		return img;
	}
	
	public static BufferedImage drawCircle(int radius, int thickness, BufferedImage img, int color, int arclength, int centerX, int centerY, int elementSize){
		int i=0;
		int theta=0;
		int x=500;
		int y=500;
		int localThickness=0;
		while(localThickness<thickness){
			
			while(theta<arclength){
				
				x=(int)(radius*(Math.cos(degToRad(theta)))+centerX);
				y=(int)(radius*(Math.sin(degToRad(theta)))+centerY);	
				int inside=(0-elementSize);
				int outside=(0-elementSize);
				while(outside<elementSize){
					while(inside<elementSize){
						img.setRGB(x+(int)(inside*(Math.abs(inside*10)/elementSize)), y+(int)(outside*(Math.abs(outside*10)/elementSize)), color);
						inside++;
					}
					inside=0-elementSize;
					outside++;
				}
				
				
				
				theta++;
				
			}
			
			theta=0;
			radius++;
			localThickness++;
		}
		
		
		
		return img;
	}
	
	public static double degToRad(double thetaTemp){
		return (thetaTemp/180)*Math.PI;
	}
	
}