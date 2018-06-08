import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
<<<<<<< HEAD
import java.awt.event.*;
=======
import java.net.URL;
>>>>>>> 6a53f3f07e8524c669ee328cccee3ddab602ee7c

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
<<<<<<< HEAD
	
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
=======
}
>>>>>>> 6a53f3f07e8524c669ee328cccee3ddab602ee7c
