import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {

	//x is coordinate of player, dx is change of x
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
	
	
	
	
	
	
	
	
	
	
	
	
}
