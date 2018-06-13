import java.awt.Image;
import java.awt.Rectangle;
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
	
	Enemy en;
	Enemy en2;
	
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
		
		en = new Enemy(1300);
		en2 = new Enemy(2000);
		}
		
	public void move() 
	{
		if(dx != -1)
		{
			if(left + dx <= 200)
				left = left + dx;
			else 
			{
				en.subtractX();
				en2.subtractX();
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
	
	public Enemy returnEnemy()
	{
		return en;
	}
	
	public Enemy returnEnemy2() {
		return en2;
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
	
	boolean yeet = false;
	int count = 0;
	
	public void walkAnimF()
	{
		if(yeet == false)
		{
			img = fi.getImage();
			count++;
			if(count % 5 == 0)
				yeet = true;
		}
		else
		{
			img = wi.getImage();
			count++;
			if(count % 5 == 0)
				yeet = false;
		}
	}
	
	public void walkAnimL()
	{
		if(yeet == false)
		{
			img = li.getImage();
			count++;
			if(count % 5 == 0)
				yeet = true;
		}
		else
		{
			img = wli.getImage();
			count++;
			if(count % 5 == 0)
				yeet = false;
		}

	}
	
	public Rectangle getBounds() {
		Rectangle r = new Rectangle (left, y, 130, 140);
		return r;
	}
	
}
