package imageGen;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Random;

//a class with functions to build various shapes and patterns using parametric style functions.
public class Shapes{
	//img, select, base/radius, base/thickness, base/color, base/arclength, base/arclengthEnd, base/x, base/y, base/element 
	public static BufferedImage wrapper(BufferedImage img, int equationSelect, int radiusBase, int radiusRange, int thicknessBase, int thicknessRange, int colorBase1, int colorBase2, int colorBase3, int colorBase4, int colorRange1, int colorRange2, int colorRange3, int colorRange4, int arclengthBase, int arclengthRange, int arclengthEndBase, int arclengthEndRange, int xBase, int xRange, int yBase, int yRange, int elementBase, int elementRange){

		switch(equationSelect){
		case 0:
			img=drawNebula(nextInt(radiusBase, radiusRange), nextInt(thicknessBase, thicknessRange), img, new Color(nextInt(colorBase1, colorRange1), nextInt(colorBase2, colorRange2), nextInt(colorBase3, colorRange3), nextInt(colorBase4, colorRange4)).getRGB(), nextInt(arclengthBase, arclengthRange), nextInt(arclengthEndBase, arclengthEndRange), nextInt(xBase, xRange), nextInt(yBase, yRange), nextInt(elementBase, elementRange));
		case 1:
			img=drawCircle(nextInt(radiusBase, radiusRange), nextInt(thicknessBase, thicknessRange), img, new Color(nextInt(colorBase1, colorRange1), nextInt(colorBase2, colorRange2), nextInt(colorBase3, colorRange3), nextInt(colorBase4, colorRange4)).getRGB(), nextInt(arclengthBase, arclengthRange), nextInt(arclengthEndBase, arclengthEndRange), nextInt(xBase, xRange), nextInt(yBase, yRange), nextInt(elementBase, elementRange));
		case 2:
			img=drawNoodles(nextInt(radiusBase, radiusRange), nextInt(thicknessBase, thicknessRange), img, new Color(nextInt(colorBase1, colorRange1), nextInt(colorBase2, colorRange2), nextInt(colorBase3, colorRange3), nextInt(colorBase4, colorRange4)).getRGB(), nextInt(arclengthBase, arclengthRange), nextInt(arclengthEndBase, arclengthEndRange), nextInt(xBase, xRange), nextInt(yBase, yRange), nextInt(elementBase, elementRange));
		case 3:
			img=drawNoodlesBeta(nextInt(radiusBase, radiusRange), nextInt(thicknessBase, thicknessRange), img, new Color(nextInt(colorBase1, colorRange1), nextInt(colorBase2, colorRange2), nextInt(colorBase3, colorRange3), nextInt(colorBase4, colorRange4)).getRGB(), nextInt(arclengthBase, arclengthRange), nextInt(arclengthEndBase, arclengthEndRange), nextInt(xBase, xRange), nextInt(yBase, yRange), nextInt(elementBase, elementRange));
		case 4:
			img=drawPolarAlpha(nextInt(radiusBase, radiusRange), nextInt(thicknessBase, thicknessRange), img, new Color(nextInt(colorBase1, colorRange1), nextInt(colorBase2, colorRange2), nextInt(colorBase3, colorRange3), nextInt(colorBase4, colorRange4)).getRGB(), nextInt(arclengthBase, arclengthRange), nextInt(arclengthEndBase, arclengthEndRange), nextInt(xBase, xRange), nextInt(yBase, yRange), nextInt(elementBase, elementRange));
		case 5:
			img=drawPolarBeta(nextInt(radiusBase, radiusRange), nextInt(thicknessBase, thicknessRange), img, new Color(nextInt(colorBase1, colorRange1), nextInt(colorBase2, colorRange2), nextInt(colorBase3, colorRange3), nextInt(colorBase4, colorRange4)).getRGB(), nextInt(arclengthBase, arclengthRange), nextInt(arclengthEndBase, arclengthEndRange), nextInt(xBase, xRange), nextInt(yBase, yRange), nextInt(elementBase, elementRange));
		case 6:
			img=drawPolarEpsilon(nextInt(radiusBase, radiusRange), nextInt(thicknessBase, thicknessRange), img, new Color(nextInt(colorBase1, colorRange1), nextInt(colorBase2, colorRange2), nextInt(colorBase3, colorRange3), nextInt(colorBase4, colorRange4)).getRGB(), nextInt(arclengthBase, arclengthRange), nextInt(arclengthEndBase, arclengthEndRange), nextInt(xBase, xRange), nextInt(yBase, yRange), nextInt(elementBase, elementRange));
		case 7:
			img=drawPolarGamma(nextInt(radiusBase, radiusRange), nextInt(thicknessBase, thicknessRange), img, new Color(nextInt(colorBase1, colorRange1), nextInt(colorBase2, colorRange2), nextInt(colorBase3, colorRange3), nextInt(colorBase4, colorRange4)).getRGB(), nextInt(arclengthBase, arclengthRange), nextInt(arclengthEndBase, arclengthEndRange), nextInt(xBase, xRange), nextInt(yBase, yRange), nextInt(elementBase, elementRange));
		case 8:
			img=drawPolarGraphX(nextInt(radiusBase, radiusRange), nextInt(thicknessBase, thicknessRange), img, new Color(nextInt(colorBase1, colorRange1), nextInt(colorBase2, colorRange2), nextInt(colorBase3, colorRange3), nextInt(colorBase4, colorRange4)).getRGB(), nextInt(arclengthBase, arclengthRange), nextInt(arclengthEndBase, arclengthEndRange), nextInt(xBase, xRange), nextInt(yBase, yRange), nextInt(elementBase, elementRange));
		case 9:
			img=drawNebulaBeta(nextInt(radiusBase, radiusRange), nextInt(thicknessBase, thicknessRange), img, new Color(nextInt(colorBase1, colorRange1), nextInt(colorBase2, colorRange2), nextInt(colorBase3, colorRange3), nextInt(colorBase4, colorRange4)).getRGB(), nextInt(arclengthBase, arclengthRange), nextInt(arclengthEndBase, arclengthEndRange), nextInt(xBase, xRange), nextInt(yBase, yRange), nextInt(elementBase, elementRange));
		case 10:
			img=drawNebulaGamma(nextInt(radiusBase, radiusRange), nextInt(thicknessBase, thicknessRange), img, new Color(nextInt(colorBase1, colorRange1), nextInt(colorBase2, colorRange2), nextInt(colorBase3, colorRange3), nextInt(colorBase4, colorRange4)).getRGB(), nextInt(arclengthBase, arclengthRange), nextInt(arclengthEndBase, arclengthEndRange), nextInt(xBase, xRange), nextInt(yBase, yRange), nextInt(elementBase, elementRange));			
		}
		return img;
		
	}
	
	
	
	public static BufferedImage drawNebula(int radius, int thickness, BufferedImage img, int color, int arclengthStart, int arclengthEnd, int centerX, int centerY, int elementSize){
		
		int theta=arclengthStart;
		int x;
		int y;
		int localThickness=0;
		while(localThickness<thickness){
			while(theta<arclengthEnd){
				x=(int)(radius*(Math.cos(degToRad(theta)))+centerX);
				y=(int)(radius*(Math.sin(degToRad(theta)))+centerY);	
				int inside=(0-elementSize);
				int outside=(0-elementSize);
				while(outside<elementSize){
					while(inside<elementSize){
						x=x+(int)(inside*Math.cos(x));
						y=y+(int)(outside*Math.sin(y));
						if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
							img.setRGB(x, y, color);
						}
						inside++;
					}
					inside=0-elementSize;
					outside++;
				}
				theta++;	
			}
			theta=arclengthStart;
			radius++;
			localThickness++;
		}
		return img;
	}
	
	public static BufferedImage drawCircle(int radius, int thickness, BufferedImage img, int color, int arclengthStart, int arclengthEnd, int centerX, int centerY, int elementSize){
		int theta=arclengthStart;
		int x;
		int y;
		int localThickness=0;
		while(localThickness<thickness){
			while(theta<arclengthEnd){
				x=(int)(radius*(Math.cos(degToRad(theta)))+centerX);
				y=(int)(radius*(Math.sin(degToRad(theta)))+centerY);	
				if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
					img.setRGB(x, y, color);
				}
				theta++;
			}
			theta=arclengthStart;
			radius++;
			localThickness++;
		}
		return img;
	}
	
	public static BufferedImage drawNoodles(int radius, int thickness, BufferedImage img, int color, int arclengthStart, int arclengthEnd, int centerX, int centerY, int elementSize){
		int theta=arclengthStart;
		int x;
		int y;
		int localThickness=0;
		while(localThickness<thickness){
			while(theta<arclengthEnd){
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
			theta=arclengthStart;
			radius++;
			localThickness++;
		}
		return img;
	}
	
	public static BufferedImage drawNoodlesBeta(int radius, int thickness, BufferedImage img, int color, int arclengthStart, int arcLengthEnd, int centerX, int centerY, int elementSize){
		int theta=arclengthStart;
		int x;
		int y;
		int localThickness=0;
		while(localThickness<thickness){
			while(theta<arcLengthEnd){
				y=(int)(radius*(Math.cos(degToRad(theta)))+centerY);
				x=(int)(radius*(Math.sin(degToRad(theta)))+centerX);	
				int inside=(0-elementSize);
				int outside=(0-elementSize);
				while(outside<elementSize){
					while(inside<elementSize){
						x=x+(int)(inside*(radius/elementSize));
						y=y+(int)(outside*(radius/elementSize));
						if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
							img.setRGB(x, y, color);
						}
						
						inside++;
					}
					inside=0-elementSize;
					outside++;
				}
				theta++;
			}
			theta=arclengthStart;
			radius++;
			localThickness++;
		}
		return img;
	}
	
	public static BufferedImage drawPolarAlpha(int radius, int thickness, BufferedImage img, int color, int arclengthStart, int arclengthEnd, int centerX, int centerY, int elementSize){
		
		int theta=arclengthStart;
		int x=centerX;
		int y=centerY;
		int localThickness=0;
		while(localThickness<thickness){
			while(theta<arclengthEnd){
				x=(int)(radius*(Math.pow((Math.cos(degToRad(theta))), 3))+centerX);
				y=(int)(radius*(Math.pow((Math.sin(degToRad(theta))), 1))+centerY);
				if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
					img.setRGB(x, y, color);
				}
				theta++;
			}
			theta=arclengthStart;
			radius++;
			localThickness++;
		}
		return img;
	}
	public static BufferedImage drawPolarBeta(int radius, int thickness, BufferedImage img, int color, int arclengthStart, int arclengthEnd, int centerX, int centerY, int elementSize){
		int theta=arclengthStart;
		int x=centerX;
		int y=centerY;
		int localThickness=0;
		while(localThickness<thickness){
			while(theta<arclengthEnd){
				x=(int)(radius*(Math.pow((Math.cos(degToRad(theta))), elementSize))+centerX);
				y=(int)(radius*(Math.pow((Math.sin(degToRad(theta))), elementSize))+centerY);
				if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
					img.setRGB(x, y, color);
				}
				theta++;
			}
			theta=arclengthStart;
			radius++;
			localThickness++;
		}
		return img;
	}
	
	public static BufferedImage drawPolarEpsilon(int radius, int thickness, BufferedImage img, int color, int arclengthStart, int arclengthEnd, int centerX, int centerY, int elementSize){
		int theta=arclengthStart;
		int x=centerX;
		int y=centerY;
		int localThickness=0;
		while(localThickness<thickness){
			while(theta<arclengthEnd){
				x=theta;
				y=(int)(radius*(Math.pow((Math.sin(degToRad(theta))), elementSize))+centerY);
				if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
					img.setRGB(x, y, color);
				}
				theta++;
			}
			
			theta=arclengthStart;
			radius++;
			localThickness++;
		}
		return img;
	}
	
	public static BufferedImage drawPolarGamma(int radius, int thickness, BufferedImage img, int color, int arclengthStart, int arclengthEnd, int centerX, int centerY, int elementSize){
		int theta=arclengthStart;
		int x=centerX;
		int y=centerY;
		int localThickness=0;
		while(localThickness<thickness){
			while(theta<arclengthEnd){
				y=theta;
				x=(int)(radius*(Math.pow((Math.sin(degToRad(theta))), elementSize))+centerY);
				if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
					img.setRGB(x, y, color);
				}
				theta++;
			}
			
			theta=arclengthStart;
			radius++;
			localThickness++;
		}
		return img;
	}

public static BufferedImage drawPolarGraphX(int radius, int thickness, BufferedImage img, int color, int arclengthStart, int arclengthEnd, int centerX, int centerY, int elementSize){
	int theta=arclengthStart;
	int x=centerX;
	int y=centerY;
	int localThickness=0;
	while(localThickness<thickness){
		while(theta<arclengthEnd){
			x=theta;
			y=(int)(radius*(Math.pow((Math.sin(degToRad(theta))), elementSize))+centerY);
			if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
				img.setRGB(x, y, color);
			}
			theta++;
		}
		
		theta=arclengthStart;
		radius++;
		localThickness++;
	}
	return img;
}

public static BufferedImage drawNebulaBeta(int radius, int thickness, BufferedImage img, int color, int arclengthStart, int arclengthEnd, int centerX, int centerY, int elementSize){
	int theta=arclengthStart;
	int x;
	int y;
	int localThickness=0;
	while(localThickness<thickness){
		while(theta<arclengthEnd){
			x=(int)(radius*(Math.cos(degToRad(theta)))+centerX);
			y=(int)(radius*(Math.sin(degToRad(theta)))+centerY);	
			int inside=(0-elementSize);
			int outside=(0-elementSize);
			while(outside<elementSize){
				while(inside<elementSize){
					x=x+(int)(inside*Math.cos(x));
					y=y+(int)(outside*Math.sin(y));
					if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
						img.setRGB(x, y, color);
					}
					inside++;
				}
				inside=0-elementSize;
				outside++;
			}
			theta++;	
			radius++;
		}
		theta=arclengthStart;
		radius=0;
		localThickness++;
	}
	return img;
}

public static BufferedImage drawNebulaGamma(int radius, int thickness, BufferedImage img, int color, int arclengthStart, int arclengthEnd, int centerX, int centerY, int elementSize){
	int theta=arclengthStart;
	int x;
	int y;
	int localThickness=0;
	while(localThickness<thickness){
		while(theta<arclengthEnd){
			x=(int)(radius*(Math.cos(degToRad(theta)))+centerX);
			y=(int)(radius*(Math.sin(degToRad(theta)))+centerY);	
			int inside=(0-elementSize);
			int outside=(0-elementSize);
			while(outside<elementSize){
				while(inside<elementSize){
					x=x+(int)(inside*(1/Math.cos(x)));
					y=y+(int)(outside*(1/Math.sin(y)));
					if(x<ref.Settings.imgWidth && x>0 && y<ref.Settings.imgHeight && y>0){
						img.setRGB(x, y, color);
					}
					inside++;
				}
				inside=0-elementSize;
				outside++;
			}
			theta++;	
			radius++;
		}
		theta=arclengthStart;
		radius=0;
		localThickness++;
	}
	return img;
}

public static double degToRad(double thetaTemp){
	return (thetaTemp/180)*Math.PI;
}

public static int nextInt(int base, int range){
	Random rand= new Random();
	
	int output= rand.nextInt(range+1)+base;
	
	return output;
}

}

