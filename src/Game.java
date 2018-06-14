import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

@SuppressWarnings("serial")
public class Game extends JPanel implements ActionListener, Runnable
{
	
	int breakCount = 0;
	
	int score = 0;
	
	Player p;
	
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
	
	int count = 4;
	
	private Image img;
	Timer time;
	Thread animator;
	int height = 420;
	private URL b;
	private ImageIcon i;
	
	public Game() 
	{
		p = new Player();
		
		en = p.returnEnemy();
		en2 = p.returnEnemy2();
		en3 = p.returnEnemy3();
		en4 = p.returnEnemy4();
		en5 = p.returnEnemy5();
		en6 = p.returnEnemy6();
		en7 = p.returnEnemy7();
		
		h1 = p.returnHeart1();
		h2 = p.returnHeart2();
		h3 = p.returnHeart3();
		
		k1 = p.returnKF1();
		k2 = p.returnKF2();
		k3 = p.returnKF3();
		k4 = p.returnKF4();
		k5 = p.returnKF5();
		k6 = p.returnKF6();
		k7 = p.returnKF7();
		k8 = p.returnKF8();
		
		addKeyListener(new ActionListener());
		setFocusable(true);
		b = getClass().getResource("asset/background.png");
		i = new ImageIcon(b);
		img = i.getImage();
		time = new Timer(5, this);
		time.start();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		p.move();
		if((p.getX() > 4400) && breakCount == 0) {
			
			WinScreen win = new WinScreen(p.returnDist() + score + (count*100));
			p.noMove();
			breakCount++;
			
		}
		if (en.getBounds().intersects(getBound())) 
		{
			en.delete();
			count--;
			if (count == 3)
				h3.delete();
			else if(count == 2)
				h2.delete();
			else if(count == 1) {
				h1.delete();
				p.noMove();
				FinalScreen s = new FinalScreen(p.returnDist() + score + (count*100));
			}
		}
		if (en2.getBounds().intersects(getBound()))
		{
			en2.delete();
			count--;
			if (count == 3)
				h3.delete();
			else if(count == 2)
				h2.delete();
			else if(count == 1) {
				h1.delete();
				p.noMove();
				FinalScreen s = new FinalScreen(p.returnDist() + score + (count*100));
			}
		}
		if (en3.getBounds().intersects(getBound()))
		{
			en3.delete();
			count--;
			if (count == 3)
				h3.delete();
			else if(count == 2)
				h2.delete();
			else if(count == 1) {
				h1.delete();
				p.noMove();
				FinalScreen s = new FinalScreen(p.returnDist() + score + (count*100));
			}
		}
		if (en4.getBounds().intersects(getBound()))
		{
			en4.delete();
			count--;
			if (count == 3)
				h3.delete();
			else if(count == 2)
				h2.delete();
			else if(count == 1) {
				h1.delete();
				p.noMove();
				FinalScreen s = new FinalScreen(p.returnDist() + score + (count*100));
			}
		}
		if (en5.getBounds().intersects(getBound()))
		{
			en5.delete();
			count--;
			if (count == 3)
				h3.delete();
			else if(count == 2)
				h2.delete();
			else if(count == 1) {
				h1.delete();
				p.noMove();
				FinalScreen s = new FinalScreen(p.returnDist() + score + (count*100));
			}
		}
		if (en6.getBounds().intersects(getBound()))
		{
			en6.delete();
			count--;
			if (count == 3)
				h3.delete();
			else if(count == 2)
				h2.delete();
			else if(count == 1) {
				h1.delete();
				p.noMove();
				FinalScreen s = new FinalScreen(p.returnDist() + score + (count*100));
			}
		}
		if (en7.getBounds().intersects(getBound()))
		{
			en7.delete();
			count--;
			if (count == 3)
				h3.delete();
			else if(count == 2)
				h2.delete();
			else if(count == 1) {
				h1.delete();
				p.noMove();
				FinalScreen s = new FinalScreen(p.returnDist() + score + (count*100));
			}
		}
		if (k1.getBounds().intersects(getBound()))	
		{
			k1.delete();
			score = score + 400;
		}
		if (k2.getBounds().intersects(getBound()))	
		{
			k2.delete();
			score = score + 400;

		}
		if (k3.getBounds().intersects(getBound()))
		{
			k3.delete();
			score = score + 400;

		}
		if (k4.getBounds().intersects(getBound()))
		{
			k4.delete();
			score = score + 400;
		}
		if (k5.getBounds().intersects(getBound()))
		{
			k5.delete();
			score = score + 400;
		}
		if (k6.getBounds().intersects(getBound()))
		{
			k6.delete();
			score = score + 400;
		}
		if (k7.getBounds().intersects(getBound()))
		{
			k7.delete();
			score = score + 400;
		}
		if (k8.getBounds().intersects(getBound()))
		{
			k8.delete();
			score = score + 400;
		}
		repaint();
	}
	
	boolean k = false;
	
	public void paint(Graphics g)
	{
		if (p.dy == 1 & k == false)
		{
			k = true;
			animator = new Thread(this);
			animator.start();
		}
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;

		if((p.getX() - 200) % 2176 == 0)
			p.nx = 0;
		if((p.getX() - 1288) % 2176 == 0)
			p.nx2 = 0;
		g2d.drawImage(img, 1088-p.nx2, 0, null);
		if(p.getX() >= 200)
			g2d.drawImage(img, 1088-p.nx, 0, null);
		
		g2d.drawImage(p.getImage(), p.left, height, null);
		
		g2d.drawImage(en.getImage(), en.getX() , 510 , null);
		
		g2d.drawImage(en2.getImage(), en2.getX(), 510, null);
		
		g2d.drawImage(en3.getImage(), en3.getX(), 510, null);
		
		g2d.drawImage(en4.getImage(), en4.getX(), 510, null);

		g2d.drawImage(en5.getImage(), en5.getX(), 510, null);
		
		g2d.drawImage(en6.getImage(), en6.getX(), 510, null);
		
		g2d.drawImage(en7.getImage(), en7.getX(), 510, null);
		
		g2d.drawImage(h1.getImage(), h1.getX(), 0, null);
		
		g2d.drawImage(h2.getImage(), h2.getX(), 0, null);
		
		g2d.drawImage(h3.getImage(), h3.getX(), 0, null);
	
		g2d.drawImage(k1.getImage(), k1.getX(), 350, null);
		
		g2d.drawImage(k2.getImage(), k2.getX(), 350, null);
		
		g2d.drawImage(k3.getImage(), k3.getX(), 350, null);
		
		g2d.drawImage(k4.getImage(), k4.getX(), 350, null);
		
		g2d.drawImage(k5.getImage(), k5.getX(), 350, null);
		
		g2d.drawImage(k6.getImage(), k6.getX(), 350, null);
		
		g2d.drawImage(k7.getImage(), k7.getX(), 350, null);
		
		g2d.drawImage(k8.getImage(), k8.getX(), 350, null);
	
	}
	
	private class ActionListener extends KeyAdapter
	{
		public void keyReleased(KeyEvent e)
		{
			p.keyReleased(e);	
		}
		public void keyPressed(KeyEvent e)
		{
			p.keyPressed(e);
		}
	}

	@Override
	public void run()
	{
		long beforeTime, timeDiff, sleep;
		beforeTime = System.currentTimeMillis();
		while(done == false)
		{
			jumpCycle();
			timeDiff = System.currentTimeMillis() - beforeTime;
			sleep = 10 - timeDiff;
			if(sleep < 0)
				sleep = 2;
			try 
			{
				Thread.sleep(sleep);
			} 
			catch(Exception e ) 
			{}
			beforeTime = System.currentTimeMillis();
		}
		done = false;
		maxHeight = false;
		k = false;
		
	}
	
	boolean maxHeight = false;
	boolean done = false;
	
	public void jumpCycle()
	{
		if(maxHeight == false)
			height = height - 2;
		if (height ==240)
			maxHeight = true;
		if(maxHeight == true && height <= 420)
		{
			height = height + 2;
			if (height == 420)
			{
			done = true;
			}
		}
	}
	
	public Rectangle getBound() 
	{
		Rectangle r = new Rectangle (p.left, height, 130, 140);
		return r;
	}
	
	public int getDist()
	{
		return p.returnDist();
	}
}