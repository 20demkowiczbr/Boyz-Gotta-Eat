import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.*;
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



