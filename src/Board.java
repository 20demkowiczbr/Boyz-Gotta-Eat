import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel{
	
	private Image background;
	
	public Board() {
		setFocusable(true);
		ImageIcon i = new ImageIcon("C:\\Users\\K-$izzle\\FinalTitle.jpg");
		background = i.getImage();
	}

	public void paint(Graphics g) {
		super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.drawImage(background, 0, 0, null);
	}

}

