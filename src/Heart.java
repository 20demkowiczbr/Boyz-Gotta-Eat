import java.awt.*;
import java.net.URL;

import javax.swing.ImageIcon;

public class Heart
{
	int x;
	private URL i;
	private ImageIcon icon;
	private Image img;
	
	public Heart(int num)
	{
		x = num;
		i = getClass().getResource("asset/PixelHeart.png");
		icon = new ImageIcon(i);
		img = icon.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
	}
	
	public void delete()
	{
		x = -2000;
	}
	
	public int getX()
	{
		return x;
	}
	
	public Image getImage()
	{
		return img;
	}
}
