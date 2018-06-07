import java.awt.Button;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.swing.JFrame;

public class Frame {
	
	private static Button button;
	
	public static void main(String[] args) throws IOException {
		
		JFrame frame = new JFrame();
		frame.setTitle("Platformer");
		//frame.add(new Board());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(544, 360);
		frame.setLocationRelativeTo(null);
		//frame.setLayout(new GridBagLayout());
		frame.setResizable(false);
		frame.setVisible(true);
	
		//button = new Button("Click Me");
		
		//frame.add(button);
		
		frame.getContentPane().add(new Board("asset\\FinalTitle.jpg"));
		
	}
	
}
