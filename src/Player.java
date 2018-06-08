import java.awt.Image;
import java.awt.*;
import java.net.URL;

import javax.swing.ImageIcon;

public class Player {

	//x is coordinate of player, dx is change of x
	int x, dx, y, dy;
	private URL b;
	private ImageIcon i;
	private Image img;
		public Player()
		{
			b = getClass().getResource(" ");
			i = new ImageIcon(b);
			img = i.getImage();
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
	
		
}
