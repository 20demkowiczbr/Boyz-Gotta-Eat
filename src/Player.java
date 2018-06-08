<<<<<<< HEAD
import java.awt.Image;
=======
import java.awt.*;
import java.net.URL;
>>>>>>> 6a53f3f07e8524c669ee328cccee3ddab602ee7c

import javax.swing.ImageIcon;

public class Player {

	//x is coordinate of player, dx is change of x
<<<<<<< HEAD
	int x, dx, y, dy;
	Image gorilla;
	
	public Player()
	{
		ImageIcon i = new ImageIcon("asset/gorilla.png");
		gorilla = i.getImage();
		x = 10;
		y = 10;
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
		return gorilla;
	}
=======
	int x, dx;
	private URL b;
	private ImageIcon i;
	private Image img;
		public Player()
		{
			b = getClass().getResource(" ");
			i = new ImageIcon(b);
			img = i.getImage();
		}
	
	
	
	
	
	
	
>>>>>>> 6a53f3f07e8524c669ee328cccee3ddab602ee7c
	
	
	
	
	
	
	
	
	
	
	
	
}
