import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

@SuppressWarnings("serial")
public class Game extends JPanel implements ActionListener
{
	Player p;
	private Image img;
	Timer time;
	private URL b;
	private ImageIcon i;
	
	public Game() {
		p = new Player();
		addKeyListener(new ActionListener());
		setFocusable(true);
		b = getClass().getResource("asset/background.png");
		i = new ImageIcon(b);
		img = i.getImage();
		//time is in milliseconds
		time = new Timer(5, this);
		time.start();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		p.move();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(img, 0, 0, null);
		g2d.drawImage(p.getImage(), p.getX(), p.getY(), null);
	}
	
	private class ActionListener extends KeyAdapter
	{
		public void keyReleased(KeyEvent e)
		{
			p.keyPressed(e);	
		}
		public void keyPressed(KeyEvent e)
		{
			p.keyPressed(e);
		}
	}
}



