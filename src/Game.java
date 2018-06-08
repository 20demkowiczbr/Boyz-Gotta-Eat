import java.awt.Image;
import java.net.URL;

import javax.swing.*;

@SuppressWarnings("serial")
public class Game extends JPanel{

	Player p;
	private Image img;
	private URL b;
	private ImageIcon i;
	
	public Game() {
		p = new Player();
		setFocusable(true);
		b = getClass().getResource(" ");
		i = new ImageIcon(b);
		img = i.getImage();
	}
}
