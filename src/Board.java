import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel{
	
	Image background;
	
	public Board() {
		ImageIcon i = new ImageIcon("asset/title.png");
		background = i.getImage();
	}

	public void paint(Graphics g) {
		super.paint(g) ;
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.drawImage(background, 0, 0, null);
	}
}
