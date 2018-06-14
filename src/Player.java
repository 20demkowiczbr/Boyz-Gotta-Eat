import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;

public class Player
{
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
	Enemy en3;
	Enemy en4;
	Enemy en5;
	Enemy en6;
	Enemy en7;
	
	Heart h1;
	Heart h2;
	Heart h3;
	
	KangFood k1;
	KangFood k2;
	KangFood k3;
	KangFood k4;
	KangFood k5;
	KangFood k6;
	KangFood k7;
	KangFood k8;
	
	int health;
	
	public Player()
	{
		left = 200;
		
		health = 3;
		
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
		en3 = new Enemy(2500);
		en4 = new Enemy(3000);
		en5 = new Enemy(3400);
		en6 = new Enemy(3800);
		en7 = new Enemy(4200);
		
		h1 = new Heart(0);
		h2 = new Heart(45);
		h3 = new Heart(90);
		
		k1 = new KangFood(700);
		k2 = new KangFood(1300);
		k3 = new KangFood(2000);
		k4 = new KangFood(2500);
		k5 = new KangFood(3000);
		k6 = new KangFood(3400);
		k7 = new KangFood(3800);
		k8 = new KangFood(4200);
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
				en3.subtractX();
				en4.subtractX();
				en5.subtractX();
				en6.subtractX();
				en7.subtractX();
				k1.subtractX();
				k2.subtractX();
				k3.subtractX();
				k4.subtractX();
				k5.subtractX();
				k6.subtractX();
				k7.subtractX();
				k8.subtractX();
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
	
	public Enemy returnEnemy2()
	{
		return en2;
	}
	
	public Enemy returnEnemy3() 
	{
		return en3;
	}
	
	public Enemy returnEnemy4() 
	{
		return en4;
	}
	public Enemy returnEnemy5() 
	{
		return en5;
	}
	public Enemy returnEnemy6() 
	{
		return en6;
	}
	public Enemy returnEnemy7() 
	{
		return en7;
	}
	
	public Heart returnHeart1()
	{
		return h1;
	}
	
	public Heart returnHeart2()
	{
		return h2;
	}

	public Heart returnHeart3() 
	{
		return h3;
	}
	
	public KangFood returnKF1()
	{
		return k1;
	}
	
	public KangFood returnKF2() 
	{
		return k2;
	}
	
	public KangFood returnKF3()
	{
		return k3;
	}
	
	public KangFood returnKF4()
	{
		return k4;
	}
	
	public KangFood returnKF5()
	{
		return k5;
	}
	
	public KangFood returnKF6()
	{
		return k6;
	}
	
	public KangFood returnKF7()
	{
		return k7;
	}
	
	public KangFood returnKF8()
	{
		return k8;
	}
	
	public int returnDist()
	{
		return x - 200;
	}
	
	public void noMove() {
		dx = 0;
		dy = 0;
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
		{
			dy = 1;
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
