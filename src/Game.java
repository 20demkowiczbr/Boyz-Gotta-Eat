import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.*;

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
	
	private class ActionListener extends KeyAdapter
	{
		public void keyReleased(KeyEvent e)
		{
				
		}
		public void keyPressed(KeyEvent e)
		{
			
		}
	}
}