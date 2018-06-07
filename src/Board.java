import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel{
	private URL b;
	private Image background;
	
	public Board() {
		setFocusable(true);
		b = getClass().getResource("/asset/title.png");
		ImageIcon i = new ImageIcon(b);
		background = i.getImage();
	}
//C:\\Users\\19krupake\\title.png
	public void paint(Graphics g) {
		super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.drawImage(background, 0, 0, null);
	}

}

