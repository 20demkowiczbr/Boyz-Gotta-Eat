import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Board extends JPanel{
	
	private URL b;
	private ImageIcon i;
	
	public Board(String string) {
		setFocusable(true);
		b = getClass().getResource(string);
		i = new ImageIcon(b);
	}
	
	public ImageIcon returnIcon() {
		return i;
	}
}

