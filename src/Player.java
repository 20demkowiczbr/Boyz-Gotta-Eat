import java.awt.Image;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;

public class Player {

	//x is hor coordinate of player, dx is change of x, y is vert coordinate of player, nx and nx2 are for determining when to repeat bg
	int x, dx, y, nx2, nx;
	private URL b;
	private ImageIcon i;
	private Image img;
		public Player()
		{
			b = getClass().getResource("asset/gorilla1.png");
			i = new ImageIcon(b);
			img = i.getImage();
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
		
		dx=0;
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
			dx = -1;
		else if(key == KeyEvent.VK_D)
			dx = 1;
		else
			dx=0;
		System.out.println(dx);

	}
	
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_A)
			dx = 0;
		if(key == KeyEvent.VK_D) 
			dx = 0;
		
		
	}
}
