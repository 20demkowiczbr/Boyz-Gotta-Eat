import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Game extends JPanel implements ActionListener{

	Player p;
	Image img;
	
	public Game() 
	{
		p = new Player();
		setFocusable(true);
		ImageIcon i = new ImageIcon("asset/background.png");
		img = i.getImage();
		//sets timer to update player every 5 milliseconds
		time = new Timer(5, this);
		time.start();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
	}
	
	
}