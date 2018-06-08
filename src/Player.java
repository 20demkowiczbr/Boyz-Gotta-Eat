import java.awt.Image;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;

public class Player {

	//x is coordinate of player, dx is change of x
	int x, dx, y;
	private URL b;
	private ImageIcon i;
	private Image img;
		public Player()
		{
			b = getClass().getResource("asset/gorilla1.png");
			i = new ImageIcon(b);
			img = i.getImage();
			x=10;
			y=10;
		}
	
	public void move() 
	{
		x = x + dx;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}

	public Image getImage()
	{
		return img;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_A);
			dx = -1;
			
		if(key == KeyEvent.VK_D);
			dx = 1;
	}
	
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_A);
			dx = 0;
			
		if(key == KeyEvent.VK_D);
			dx = 0;
	}
}
