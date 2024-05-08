package cardBattle.game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable, MouseListener, KeyListener{
	private boolean running;
	private Thread thread;
	private static JFrame frame;
	
	
	
	//Dimensões da JFrame inicial
	public static int WIDTH = 1000;
	public static int HEIGHT = 650;
	
	//Dimensões do canva
	
	public static double scale;
	
	//offset
	public static int horizontalOffset;
	public static int verticalOffset;
	
	
	public static GraphicsDevice device;
	public static boolean isFullScreen;
	
	private BufferedImage image;
	
	private static final double ASPECT_RATIO = (double) WIDTH / HEIGHT;
	
	public static Random rand;
	
	public static GameState gameState;
	
	public Game() {
		rand = new Random();
		device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
		isFullScreen = false;
		gameState = new GameState();
		
		addMouseListener(this);
		addKeyListener(this);
		addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                
                image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
                
            }
        });
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		initFrame();
		requestFocus();
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	}
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		running = true;
		thread.start();
	}
	public synchronized void stop() {
		running = false;
		try {
			thread.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		long lt = System.nanoTime();
		double ticks = 60.0;
		double ns = 1000000000 / ticks;
		double delta = 0;
		int frames = 0;
		double timer = System.currentTimeMillis();
		while(running) {
			long now = System.nanoTime();
			delta+=(now-lt)/ns;
			lt = now;
			if(delta>=1) {
				tick();
				render();
				frames++;
				delta--;
			}
			if(System.currentTimeMillis() - timer >= 1000) {
				//System.out.println("Frames: "+frames);
				frames = 0;
				timer+=1000;
			}
		}
		stop();
		
	}
	
	public void tick() {
		
	}
	public void render() {
	    BufferStrategy bs = this.getBufferStrategy();
	    if (bs == null) {
	        this.createBufferStrategy(3);
	        return;
	    }
	    Graphics g = image.getGraphics();
	    g.setColor(new Color(0,0,0));
	    g.fillRect(0, 0, frame.getContentPane().getWidth(), frame.getContentPane().getHeight());
	    
	    int canvasWidth, canvasHeight;
	    double frameAspectRatio = (double) frame.getContentPane().getWidth()/frame.getContentPane().getHeight();
	    
	    if(frameAspectRatio > ASPECT_RATIO) {
	    	canvasHeight = frame.getContentPane().getHeight();
	    	canvasWidth = (int) (frame.getContentPane().getHeight()*ASPECT_RATIO);
	    }else {
	    	canvasWidth = frame.getContentPane().getWidth();
	    	canvasHeight = (int) (frame.getContentPane().getWidth()/ASPECT_RATIO);
	    }
	    
	    horizontalOffset =  (frame.getContentPane().getWidth()-canvasWidth)/2;
	    verticalOffset =  (frame.getContentPane().getHeight()-canvasHeight)/2;
	    
	    
	    g.setColor(new Color(20, 20, 20));
	   
	    	g.fillRect( horizontalOffset, verticalOffset, canvasWidth, canvasHeight);
	    
	    
	    scale = (double)canvasWidth/(double)WIDTH;
	    System.out.println(scale);
	    gameState.render(g);
	    g.dispose();
	    g = bs.getDrawGraphics();
	    g.drawImage(image, 0, 0, frame.getContentPane().getWidth(), frame.getContentPane().getHeight(), null);
	    bs.show();

	}
	
	
	public void initFrame() {
		frame = new JFrame("Batalha de cartas");
		frame.add(this);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(false);
		frame.setVisible(true);
		frame.pack();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_F11) {
			if(!isFullScreen) {
				frame.dispose();
				frame.setUndecorated(true);
				frame.setVisible(true);
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				device.setFullScreenWindow(frame);
				requestFocus();
				isFullScreen = true;
			}else {
				frame.dispose();
				frame.setUndecorated(false);
				frame.setVisible(true);
				frame.pack();
				requestFocus();
				isFullScreen = false;
			}
			
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
