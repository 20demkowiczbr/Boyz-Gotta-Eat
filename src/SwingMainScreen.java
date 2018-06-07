import java.awt.Button;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingMainScreen extends JFrame{
	
	private static Button button;
	
	public SwingMainScreen() {
		
		runView();
		
	}
	
	public void runView() {
		
		button = new Button("Click Me");
		
		setTitle("Platformer");
		setSize(544, 360);
		setLayout(new GridBagLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(button);
		
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingMainScreen().setVisible(true);
			}
		});
	}
}
