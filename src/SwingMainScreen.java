import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class SwingMainScreen extends JPanel{
	
	private static Button button;
	private static Image background;
	
	public SwingMainScreen() {
		
		runView();
		
	}
	
	public void runView() {
		
		button = new Button("Click Me");
		
		ImageIcon i = new ImageIcon("asset/title.png");
		background = i.getImage();
		
		JFrame frame = new JFrame();
		frame.setTitle("Platformer");
		frame.setSize(544, 360);
		frame.setLayout(new GridBagLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
		
		//getContentPane().add(new JPanelWithBackground("asset/title.png"));
		
		frame.add(button);		
		
	}
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingMainScreen();
			}
		});
	}
}
