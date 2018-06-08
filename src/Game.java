import java.awt.Image;
import javax.swing.*;

@SuppressWarnings("serial")
public class Game extends JPanel{

	Player p;
	Image img;
	
	public Game() {
		p = new Player();
		setFocusable(true);
		ImageIcon i = new ImageIcon("asset/gorilla1.png");
		img = i.getImage();
	}
}
