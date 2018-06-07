import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel{
	
	private Image background;
	
	/*public Board(String string) {
		setFocusable(true);
		ImageIcon i = new ImageIcon("asset/title.png");
		background = i.getImage();
	}
	*/

	/*public void paint(Graphics g) {
		super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.drawImage(background, 0, 0, null);
	}
*/
	public Board(String fileName) {
	    try {
			background = ImageIO.read(new File(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

	  public void paintComponent(Graphics g) {
	    super.paintComponent(g);

	    // Draw the background image.
	    g.drawImage(background, 0, 0, this);
	  }
	}

