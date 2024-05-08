package cardBattle.game;

import java.awt.Color;
import java.awt.Graphics;

public class GameState {
	
	public GameState() {
		
	}
	
	public void render(Graphics g) {
		LayoutForms.DrawCustomizedRect(g, 30, 30, 250, 180, new Color(28, 1, 4), 1);
	}
	

}
