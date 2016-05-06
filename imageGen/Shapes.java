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
						if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
							img.setRGB(x+(int)(inside*Math.cos(x)), y+(int)(outside*Math.sin(y)), color);
						}
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
				if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
					img.setRGB(x, y, color);
				}
				theta++;
			}
			theta=0;
			radius++;
			localThickness++;
		}
		return img;
	}
	
	public static BufferedImage drawNoodles(int radius, int thickness, BufferedImage img, int color, int arclength, int centerX, int centerY, int elementSize){
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
						x=x+(int)(inside*(radius/elementSize));
						y=y+(int)(outside*(radius/elementSize));
						if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){	
							img.setRGB(x,y,color);
						}
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
	
	public static BufferedImage drawNoodlesBeta(int radius, int thickness, BufferedImage img, int color, int arcLengthStart, int arcLengthEnd, int centerX, int centerY, int elementSize){
		int i=0;
		int theta=arcLengthStart;
		int x=500;
		int y=500;
		int localThickness=0;
		while(localThickness<thickness){
			while(theta<arcLengthEnd){
				y=(int)(radius*(Math.cos(degToRad(theta)))+centerY);
				x=(int)(radius*(Math.sin(degToRad(theta)))+centerX);	
				int inside=(0-elementSize);
				int outside=(0-elementSize);
				while(outside<elementSize){
					while(inside<elementSize){
						if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
							img.setRGB(x+(int)(inside*(radius/elementSize)), y+(int)(outside*(radius/elementSize)), color);
						}
						
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
	
	public static BufferedImage drawPolarAlpha(int radius, int thickness, BufferedImage img, int color, int arclength, int centerX, int centerY, int elementSize){
		int i=0;
		int theta=0;
		int x=centerX;
		int y=centerY;
		int localThickness=0;
		while(localThickness<thickness){
			while(theta<arclength){
				x=(int)(radius*(Math.pow((Math.cos(degToRad(theta))), 3))+centerX);
				y=(int)(radius*(Math.pow((Math.sin(degToRad(theta))), 1))+centerY);
				if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
					img.setRGB(x, y, color);
				}
				else{
					System.out.println(x);
					System.out.println(y);
				}
				theta++;
			}
			theta=0;
			radius++;
			localThickness++;
		}
		return img;
	}
	public static BufferedImage drawPolarBeta(int radius, int thickness, BufferedImage img, int color, int arclength, int centerX, int centerY, int elementSize){
		int i=0;
		int theta=0;
		int x=centerX;
		int y=centerY;
		int localThickness=0;
		while(localThickness<thickness){
			while(theta<arclength){
				x=(int)(radius*(Math.pow((Math.cos(degToRad(theta))), elementSize))+centerX);
				y=(int)(radius*(Math.pow((Math.sin(degToRad(theta))), elementSize))+centerY);
				if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
					img.setRGB(x, y, color);
				}
				else{
					System.out.println(x);
					System.out.println(y);
				}
				theta++;
			}
			theta=0;
			radius++;
			localThickness++;
		}
		return img;
	}
	
	public static BufferedImage drawPolarEpsilon(int radius, int thickness, BufferedImage img, int color, int arclength, int centerX, int centerY, int elementSize){
		int i=0;
		int theta=0;
		int x=centerX;
		int y=centerY;
		int localThickness=0;
		while(localThickness<thickness){
			while(theta<arclength){
				x=theta;
				y=(int)(radius*(Math.pow((Math.sin(degToRad(theta))), elementSize))+centerY);
				if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
					img.setRGB(x, y, color);
				}
				else{
					System.out.println(x);
					System.out.println(y);
				}
				theta++;
			}
			
			theta=0;
			radius++;
			localThickness++;
		}
		return img;
	}
	
	public static BufferedImage drawPolarGamma(int radius, int thickness, BufferedImage img, int color, int arclength, int centerX, int centerY, int elementSize){
		int i=0;
		int theta=0;
		int x=centerX;
		int y=centerY;
		int localThickness=0;
		while(localThickness<thickness){
			while(theta<arclength){
				y=theta;
				x=(int)(radius*(Math.pow((Math.sin(degToRad(theta))), elementSize))+centerY);
				if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
					img.setRGB(x, y, color);
				}
				else{
					System.out.println(x);
					System.out.println(y);
				}
				theta++;
			}
			
			theta=0;
			radius++;
			localThickness++;
		}
		return img;
	}

public static BufferedImage drawPolarGraphX(int radius, int thickness, BufferedImage img, int color, int arclength, int centerX, int centerY, int elementSize){
	int i=0;
	int theta=0;
	int x=centerX;
	int y=centerY;
	int localThickness=0;
	while(localThickness<thickness){
		while(theta<arclength){
			x=theta;
			y=(int)(radius*(Math.pow((Math.sin(degToRad(theta))), elementSize))+centerY);
			if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
				img.setRGB(x, y, color);
			}
			else{
				System.out.println(x);
				System.out.println(y);
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