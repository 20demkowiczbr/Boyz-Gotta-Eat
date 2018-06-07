import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Board extends JPanel{
	
	private URL b;
	private Image background;
	private ImageIcon i;
	
	
	public Board() {
		setFocusable(true);
		b = getClass().getResource("/asset/title.png");
		i = new ImageIcon(b);
		background = i.getImage();
	}
	

	public ImageIcon returnIcon() {
		return i;
	}
}

