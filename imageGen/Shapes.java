package imageGen;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Shapes{
	//img, select, base/radius, base/thickness, base/color, base/arclength, base/arclengthEnd, base/x, base/y, base/element 
	public static BufferedImage wrapper(BufferedImage img, int equationSelect, int radiusBase, int radiusRange, int thicknessBase, int thicknessRange, int colorBase1, int colorBase2, int colorBase3, int colorBase4, int colorRange1, int colorRange2, int colorRange3, int colorRange4, int arclengthBase, int arclengthRange, int arclengthEndBase, int arclengthEndRange, int xBase, int xRange, int yBase, int yRange, int elementBase, int elementRange){
		Random rand=new Random();
		
		/**TODO: Figure out what elements of these equations must be positive!**/
		switch(equationSelect){
		case 0:
			img=drawNebula((rand.nextInt(radiusRange+1)+radiusBase), (rand.nextInt(thicknessRange+1)+thicknessBase), img, new Color((rand.nextInt(colorRange1+1)+colorBase1), (rand.nextInt(colorRange2+1)+colorBase2), (rand.nextInt(colorRange3+1)+colorBase3), (rand.nextInt(colorRange4+1)+colorBase4)).getRGB(), (rand.nextInt(arclengthRange+1)+arclengthBase), (rand.nextInt(xRange+1)+xBase), (rand.nextInt(yRange+1)+yBase), (rand.nextInt(elementRange+1)+elementBase));
		case 1:
			img=drawCircle((rand.nextInt(radiusRange+1)+radiusBase), (rand.nextInt(thicknessRange+1)+thicknessBase), img,  new Color((rand.nextInt(colorRange1+1)+colorBase1), (rand.nextInt(colorRange2+1)+colorBase2), (rand.nextInt(colorRange3+1)+colorBase3), (rand.nextInt(colorRange4+1)+colorBase4)).getRGB(), (rand.nextInt(arclengthRange+1)+arclengthBase), (rand.nextInt(xRange+1)+xBase), (rand.nextInt(yRange+1)+yBase), (rand.nextInt(elementRange+1)+Math.abs(elementBase)));
		case 2:
			img=drawNoodles((rand.nextInt(radiusRange+1)+radiusBase), (rand.nextInt(thicknessRange+1)+thicknessBase), img,  new Color((rand.nextInt(colorRange1+1)+colorBase1), (rand.nextInt(colorRange2+1)+colorBase2), (rand.nextInt(colorRange3+1)+colorBase3), (rand.nextInt(colorRange4+1)+colorBase4)).getRGB(), (rand.nextInt(arclengthRange+1)+arclengthBase), (rand.nextInt(xRange+1)+xBase), (rand.nextInt(yRange+1)+yBase), (rand.nextInt(elementRange+1)+elementBase));
		case 3:
			img=drawNoodlesBeta((rand.nextInt(radiusRange+1)+radiusBase), (rand.nextInt(thicknessRange+1)+thicknessBase), img,  new Color((rand.nextInt(colorRange1+1)+colorBase1), (rand.nextInt(colorRange2+1)+colorBase2), (rand.nextInt(colorRange3+1)+colorBase3), (rand.nextInt(colorRange4+1)+colorBase4)).getRGB(), (rand.nextInt(arclengthRange+1)+arclengthBase), (rand.nextInt(arclengthEndRange+1)+arclengthEndBase), (rand.nextInt(xRange+1)+xBase), (rand.nextInt(yRange+1)+yBase), (rand.nextInt(elementRange+1)+Math.abs(elementBase)));
		case 4:
			img=drawPolarAlpha((rand.nextInt(radiusRange+1)+radiusBase), (rand.nextInt(thicknessRange+1)+thicknessBase), img,  new Color((rand.nextInt(colorRange1+1)+colorBase1), (rand.nextInt(colorRange2+1)+colorBase2), (rand.nextInt(colorRange3+1)+colorBase3), (rand.nextInt(colorRange4+1)+colorBase4)).getRGB(), (rand.nextInt(arclengthRange+1)+arclengthBase), (rand.nextInt(xRange+1)+xBase), (rand.nextInt(yRange+1)+yBase), (rand.nextInt(elementRange+1)+elementBase));
		case 5:
			img=drawPolarBeta((rand.nextInt(radiusRange+1)+radiusBase), (rand.nextInt(thicknessRange+1)+thicknessBase), img,  new Color((rand.nextInt(colorRange1+1)+colorBase1), (rand.nextInt(colorRange2+1)+colorBase2), (rand.nextInt(colorRange3+1)+colorBase3), (rand.nextInt(colorRange4+1)+colorBase4)).getRGB(), (rand.nextInt(arclengthRange+1)+arclengthBase), (rand.nextInt(xRange+1)+xBase), (rand.nextInt(yRange+1)+yBase), (rand.nextInt(elementRange+1)+elementBase));
		case 6:
			img=drawPolarEpsilon((rand.nextInt(radiusRange+1)+radiusBase), (rand.nextInt(thicknessRange+1)+thicknessBase), img,  new Color((rand.nextInt(colorRange1+1)+colorBase1), (rand.nextInt(colorRange2+1)+colorBase2), (rand.nextInt(colorRange3+1)+colorBase3), (rand.nextInt(colorRange4+1)+colorBase4)).getRGB(), (rand.nextInt(arclengthRange+1)+arclengthBase), (rand.nextInt(xRange+1)+xBase), (rand.nextInt(yRange+1)+yBase), (rand.nextInt(elementRange+1)+Math.abs(elementBase)));
		case 7:
			img=drawPolarGamma((rand.nextInt(radiusRange+1)+radiusBase), (rand.nextInt(thicknessRange+1)+thicknessBase), img,  new Color((rand.nextInt(colorRange1+1)+colorBase1), (rand.nextInt(colorRange2+1)+colorBase2), (rand.nextInt(colorRange3+1)+colorBase3), (rand.nextInt(colorRange4+1)+colorBase4)).getRGB(), (rand.nextInt(arclengthRange+1)+arclengthBase), (rand.nextInt(xRange+1)+xBase), (rand.nextInt(yRange+1)+yBase), (rand.nextInt(elementRange+1)+elementBase));
		case 8:
			img=drawPolarGraphX((rand.nextInt(radiusRange+1)+radiusBase), (rand.nextInt(thicknessRange+1)+thicknessBase), img,  new Color((rand.nextInt(colorRange1+1)+colorBase1), (rand.nextInt(colorRange2+1)+colorBase2), (rand.nextInt(colorRange3+1)+colorBase3), (rand.nextInt(colorRange4+1)+colorBase4)).getRGB(), (rand.nextInt(arclengthRange+1)+arclengthBase), (rand.nextInt(xRange+1)+xBase), (rand.nextInt(yRange+1)+yBase), (rand.nextInt(elementRange+1)+elementBase));
		case 9:
			img=drawNebulaBeta((rand.nextInt(radiusRange+1)+radiusBase), (rand.nextInt(thicknessRange+1)+thicknessBase), img,  new Color((rand.nextInt(colorRange1+1)+colorBase1), (rand.nextInt(colorRange2+1)+colorBase2), (rand.nextInt(colorRange3+1)+colorBase3), (rand.nextInt(colorRange4+1)+colorBase4)).getRGB(), (rand.nextInt(arclengthRange+1)+arclengthBase), (rand.nextInt(xRange+1)+xBase), (rand.nextInt(yRange+1)+yBase), (rand.nextInt(elementRange+1)+Math.abs(elementBase)));
		case 10:
			img=drawNebulaGamma((rand.nextInt(radiusRange+1)+radiusBase), (rand.nextInt(thicknessRange+1)+thicknessBase), img,  new Color((rand.nextInt(colorRange1+1)+colorBase1), (rand.nextInt(colorRange2+1)+colorBase2), (rand.nextInt(colorRange3+1)+colorBase3), (rand.nextInt(colorRange4+1)+colorBase4)).getRGB(), (rand.nextInt(arclengthRange+1)+arclengthBase), (rand.nextInt(xRange+1)+xBase), (rand.nextInt(yRange+1)+yBase), (rand.nextInt(elementRange+1)+Math.abs(elementBase)));			
		}
		return img;
		
	}
	
	
	
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
					//System.out.println(x);
					//System.out.println(y);
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
					//System.out.println(x);
					//System.out.println(y);
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
					//System.out.println(x);
					//System.out.println(y);
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
					//System.out.println(x);
					//System.out.println(y);
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
				//System.out.println(x);
				//System.out.println(y);
			}
			theta++;
		}
		
		theta=0;
		radius++;
		localThickness++;
	}
	return img;
}

public static BufferedImage drawNebulaBeta(int radius, int thickness, BufferedImage img, int color, int arclength, int centerX, int centerY, int elementSize){
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
		theta=0;
		radius=0;
		localThickness++;
	}
	return img;
}

public static BufferedImage drawNebulaGamma(int radius, int thickness, BufferedImage img, int color, int arclength, int centerX, int centerY, int elementSize){
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
		theta=0;
		radius=0;
		localThickness++;
	}
	return img;
}

public static double degToRad(double thetaTemp){
	return (thetaTemp/180)*Math.PI;
}

}