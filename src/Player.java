import java.awt.Image;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;

public class Player {

	int x, dx, y, dy, nx2, nx, left; //Note that "x" is distance past starting point, while "left" is that physical position on screen
	private URL f;
	private URL l;
	private URL w;
	private URL wl;
	private ImageIcon fi;
	private ImageIcon li;
	private ImageIcon wi;
	private ImageIcon wli;

	private Image img;
	
	public Player()
	{
		left = 200;
		
		f = getClass().getResource("asset/gorilla1.png");
		fi = new ImageIcon(f);
		
		w = getClass().getResource("asset/gorillawalk.png");
		wi = new ImageIcon(w);
		
		l = getClass().getResource("asset/gorillaleft.png");
		li = new ImageIcon(l);
		
		wl = getClass().getResource("asset/gorillawalkleft.png");
		wli = new ImageIcon(wl);
		
		img = fi.getImage();
		
		x=200;
		y=420;
		nx2=1088;
		nx=0;
		}
		
	public void move() 
	{
		if(dx != -1)
		{
			if(left + dx <= 200)
				left = left + dx;
			else 
			{
				x = x + dx;
				nx2 = nx2 + dx;
				nx = nx + dx;
			}
		}
		else
		{
			if(left + dx > 0)
				left = left + dx;
		}
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
		
		if(key == KeyEvent.VK_A)
		{
			dx = -1;
			walkAnimL();
		}
		if(key == KeyEvent.VK_D)
		{
			dx = 1;
			walkAnimF();

		}
		if(key == KeyEvent.VK_W)
			dy = 1;
	}
	
	boolean yeet = false;
	
	public void walkAnimF()
	{
		if(yeet == false)
		{
			img = fi.getImage();
			yeet = true;
		}
		else
		{
			img = wi.getImage();
			yeet = false;
		}
	}
	
	public void walkAnimL()
	{
		if(yeet == false)
		{
			img = li.getImage();
			yeet = true;
		}
		else
		{
			img = wli.getImage();
			yeet = false;
		}

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
