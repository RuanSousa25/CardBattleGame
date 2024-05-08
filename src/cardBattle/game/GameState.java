package cardBattle.game;

import java.awt.Color;
import java.awt.Graphics;

public class GameState {
	
	public GameState() {
		
	}
	
	public void render(Graphics g) {
		LayoutForms.DrawCustomizedRect(g, 30, 70, 300, 140, new Color(66, 9, 11), 6, new Color(50,0,0));
		LayoutForms.DrawCustomizedRect(g, 670, 380, 300, 140, new Color(9, 23, 66), 6, new Color(6, 16, 46));
		LayoutForms.DrawCustomizedRect(g, 250, 600, 500, 50, new Color(9, 23, 66), 6, new Color(6, 16, 46));
	}
	

}
