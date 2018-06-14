import java.awt.*;
import java.net.URL;
import javax.swing.*;



public class Enemy
{
	int x;
	private URL i;
	private ImageIcon icon;
	private Image img;
	
	public Enemy(int num)
	{
		x = num;
		i = getClass().getResource("asset/penguin128.png");
		icon = new ImageIcon(i);
		img = icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
		
	}
	
	public int getX()
	{
		return x;
	}
	
	public Image getImage()
	{
		return img;
	}
	
	public void subtractX()
	{
		x = x-1;
	}
	
	public void delete() {
		x = -1300;
	}
	
	public Rectangle getBounds() 
	{
		Rectangle r = new Rectangle (x, 510, 50, 50);
		return r;
	}
}