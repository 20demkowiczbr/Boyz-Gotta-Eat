import java.awt.Image;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;

public class Player {

	int x, dx, y, dy, nx2, nx;
	private URL f;
	private URL l;
	private ImageIcon fi;
	private ImageIcon li;
	private Image imgf;
	
		public Player()
		{
			f = getClass().getResource("asset/gorilla1.png");
			fi = new ImageIcon(f);
			imgf = fi.getImage();

			l = getClass().getResource("asset/gorillaleft.png");
			li = new ImageIcon(l);
			
			x=200;
			y=420;
			nx2=1088;
			nx=0;
		}
	public void move() 
	{
		x = x + dx;
		nx2 = nx2 + dx;
		nx = nx + dx;
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
		return imgf;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_A)
		{
			dx = -1;
			imgf = li.getImage();
		}
		if(key == KeyEvent.VK_D)
		{
			dx = 1;
			imgf = fi.getImage();
		}
		if(key == KeyEvent.VK_W)
			dy = 1;
			//jump image?
	}
	
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_A)
			dx = 0;
		if(key == KeyEvent.VK_D) 
			dx = 0;
		if(key == KeyEvent.VK_W)
			dy = 0;
	}
}
