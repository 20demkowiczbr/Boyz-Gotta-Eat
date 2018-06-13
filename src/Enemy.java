import java.awt.*;
import java.net.URL;
import javax.swing.*;



public class Enemy {

	int x;
	private URL i;
	private ImageIcon icon;
	private Image img;
	
	public Enemy()
	{
		x = 500;
		
		i = getClass().getResource("asset/penguin128.png");
		icon = new ImageIcon(i);
		img = icon.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
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
	
	public Rectangle getBounds() {
		Rectangle r = new Rectangle (x, 490, 70, 70);
		return r;
	}
}