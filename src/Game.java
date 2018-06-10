import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

@SuppressWarnings("serial")
public class Game extends JPanel implements ActionListener, Runnable
{
	Player p;
	private Image img;
	Timer time;
	Thread animator;
	int height = 420;
	private URL b;
	private ImageIcon i;
	
	public Game() 
	{
		p = new Player();
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
		g2d.drawImage(p.getImage(), 200, height, null);
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
			height--;
		if (height == 360)
			maxHeight = true;
		if(maxHeight == true && height <= 420)
		{
			height++;
			if (height == 420)
				done = true;
		}
	}
}