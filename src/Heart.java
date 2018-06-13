import java.awt.*;
import java.net.URL;

import javax.swing.ImageIcon;

public class Heart {

	int x;
	private URL i;
	private ImageIcon icon;
	private Image img;
	
	public Heart(int num) {
		x = num;
		i = getClass().getResource("asset/PixelHeart.jpg");
		icon = new ImageIcon(i);
		img = icon.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
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
	
}
