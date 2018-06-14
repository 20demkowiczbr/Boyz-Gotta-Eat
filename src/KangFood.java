

import java.awt.Image;
import java.awt.Rectangle;
import java.net.URL;

import javax.swing.ImageIcon;

public class KangFood {

	int x;
	private URL i;
	private ImageIcon icon;
	private Image img;
	
	public KangFood(int num) {
		x = num;
		i = getClass().getResource("asset/banana.png");
		icon = new ImageIcon(i);
		img = icon.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
	}
	
	public void delete() {
		x = -2000;
	}
	
	public int getX() {
		return x;
	}
	
	public void subtractX()
	{
		x = x-1;
	}
	
	public Image getImage()
	{
		return img;
	}
	
	public Rectangle getBounds() {
		Rectangle r = new Rectangle (x, 350, 40, 40);
		return r;
	}
	
}
