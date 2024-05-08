package cardBattle.game;

import java.awt.Color;
import java.awt.Graphics;

public class LayoutForms {

	
	
	public static void DrawCustomizedRect(Graphics g, int x, int y, int width, int height, Color backgroundColor) {
		int scaledX = (int)(Game.horizontalOffset+x*Game.scale);
		int scaledY = (int)(Game.verticalOffset+y*Game.scale);
		int scaledWidth = (int) (width*Game.scale);
		int scaledHeight = (int) (height*Game.scale);
		int scaledBorderWeight = (int) (2*Game.scale);
		
		
		//bordas superior e esquerda
		g.setColor(new Color(0,0,0));
		g.fillRect(scaledX-scaledBorderWeight, scaledY-scaledBorderWeight, scaledWidth+scaledBorderWeight*2, scaledHeight+scaledBorderWeight*2);
		
		
		//bordas inferior e direita
		g.setColor(new Color(10,10,10));
		g.fillRect(scaledX, scaledY, scaledWidth+scaledBorderWeight, scaledHeight+scaledBorderWeight);
		
		
		g.setColor(backgroundColor);
		g.fillRect(scaledX, scaledY, scaledWidth, scaledHeight);
	
		
	}
	public static void DrawCustomizedRect(Graphics g, int x, int y, int width, int height, Color backgroundColor, int borderWeight) {
		int scaledX = (int)(Game.horizontalOffset+x*Game.scale);
		int scaledY = (int)(Game.verticalOffset+y*Game.scale);
		int scaledWidth = (int) (width*Game.scale);
		int scaledHeight = (int) (height*Game.scale);
		int scaledBorderWeight = (int) (borderWeight*Game.scale);
		
		
		//bordas superior e esquerda
		g.setColor(new Color(0,0,0));
		g.fillRect(scaledX-scaledBorderWeight, scaledY-scaledBorderWeight, scaledWidth+scaledBorderWeight*2, scaledHeight+scaledBorderWeight*2);
		
		
		//bordas inferior e direita
		g.setColor(new Color(10,10,10));
		g.fillRect(scaledX, scaledY, scaledWidth+scaledBorderWeight, scaledHeight+scaledBorderWeight);
		
		
		g.setColor(backgroundColor);
		g.fillRect(scaledX, scaledY, scaledWidth, scaledHeight);
		

	
		
	};
	public static void DrawCustomizedRect(Graphics g, int x, int y, int width, int height, Color backgroundColor, int borderWeight, Color BorderColor) {
		
		int scaledX = (int)(Game.horizontalOffset+x*Game.scale);
		int scaledY = (int)(Game.verticalOffset+y*Game.scale);
		int scaledWidth = (int) (width*Game.scale);
		int scaledHeight = (int) (height*Game.scale);
		int scaledBorderWeight = (int) (borderWeight*Game.scale);
		
		
		//bordas superior e esquerda
		g.setColor(BorderColor);
		g.fillRect(scaledX-scaledBorderWeight, scaledY-scaledBorderWeight, scaledWidth+scaledBorderWeight*2, scaledHeight+scaledBorderWeight*2);
		
		
		//bordas inferior e direita
		g.setColor(BorderColor.darker());
		g.fillRect(scaledX, scaledY, scaledWidth+scaledBorderWeight, scaledHeight+scaledBorderWeight);
		
		
		g.setColor(backgroundColor);
		g.fillRect(scaledX, scaledY, scaledWidth, scaledHeight);
		
	}
	public static void DrawCustomizedRect(Graphics g, int x, int y, int width, int height, Color backgroundColor, int borderWeight, Color BorderColor,Color BorderColor2) {
		
		int scaledX = (int)(Game.horizontalOffset+x*Game.scale);
		int scaledY = (int)(Game.verticalOffset+y*Game.scale);
		int scaledWidth = (int) (width*Game.scale);
		int scaledHeight = (int) (height*Game.scale);
		int scaledBorderWeight = (int) (borderWeight*Game.scale);
		
		
		//bordas superior e esquerda
		g.setColor(BorderColor);
		g.fillRect(scaledX-scaledBorderWeight, scaledY-scaledBorderWeight, scaledWidth+scaledBorderWeight*2, scaledHeight+scaledBorderWeight*2);
		
		
		//bordas inferior e direita
		g.setColor(BorderColor2);
		g.fillRect(scaledX, scaledY, scaledWidth+scaledBorderWeight, scaledHeight+scaledBorderWeight);
		
		
		g.setColor(backgroundColor);
		g.fillRect(scaledX, scaledY, scaledWidth, scaledHeight);
		
	}
}