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
		
		g.setColor(backgroundColor);
		g.fillRect(scaledX, scaledY, scaledWidth, scaledHeight);
		
		g.setColor(new Color(0, 0, 0));
		g.fillRect(scaledX, scaledY-scaledBorderWeight+1, scaledWidth, scaledBorderWeight); //Borda Superior
		g.fillRect(scaledX-scaledBorderWeight+1, scaledY, scaledBorderWeight, scaledHeight); //Borda Esquerda
		
		g.setColor(new Color(0, 0, 0));
		g.fillRect(scaledX, scaledY+scaledHeight, scaledWidth, scaledBorderWeight); //Borda Inferior
		g.fillRect(scaledX+scaledWidth, scaledY, scaledBorderWeight, scaledHeight); //Borda Direita
	
		
	}
	public static void DrawCustomizedRect(Graphics g, int x, int y, int width, int height, Color backgroundColor, int borderWeight) {
		int scaledX = (int)(Game.horizontalOffset+x*Game.scale);
		int scaledY = (int)(Game.verticalOffset+y*Game.scale);
		int scaledWidth = (int) (width*Game.scale);
		int scaledHeight = (int) (height*Game.scale);
		int scaledBorderWeight = (int) (borderWeight*Game.scale);
		
		g.setColor(backgroundColor);
		g.fillRect(scaledX, scaledY, scaledWidth, scaledHeight);
		
		g.setColor(new Color(0, 0, 0));
		g.fillRect(scaledX, scaledY-scaledBorderWeight+1, scaledWidth, scaledBorderWeight); //Borda Superior
		g.fillRect(scaledX-scaledBorderWeight+1, scaledY, scaledBorderWeight, scaledHeight); //Borda Esquerda
		
		g.setColor(new Color(0, 0, 0));
		g.fillRect(scaledX, scaledY+scaledHeight, scaledWidth, scaledBorderWeight); //Borda Inferior
		g.fillRect(scaledX+scaledWidth, scaledY, scaledBorderWeight, scaledHeight); //Borda Direita
	
		
	};
	public static void DrawCustomizedRect(Graphics g, int x, int y, int width, int height, Color backgroundColor, int borderWeight, Color BorderColor) {
		
		int scaledX = (int)(Game.horizontalOffset+x*Game.scale);
		int scaledY = (int)(Game.verticalOffset+y*Game.scale);
		int scaledWidth = (int) (width*Game.scale);
		int scaledHeight = (int) (height*Game.scale);
		int scaledBorderWeight = (int) (borderWeight*Game.scale);
		
		g.setColor(backgroundColor);
		g.fillRect(scaledX, scaledY, scaledWidth, scaledHeight);
		
		g.setColor(new Color(0, 0, 0));
		g.fillRect(scaledX, scaledY-scaledBorderWeight+1, scaledWidth, scaledBorderWeight); //Borda Superior
		g.fillRect(scaledX-scaledBorderWeight+1, scaledY, scaledBorderWeight, scaledHeight); //Borda Esquerda
		
		g.setColor(new Color(0, 0, 0));
		g.fillRect(scaledX, scaledY+scaledHeight, scaledWidth, scaledBorderWeight); //Borda Inferior
		g.fillRect(scaledX+scaledWidth, scaledY, scaledBorderWeight, scaledHeight); //Borda Direita
		
	}
}