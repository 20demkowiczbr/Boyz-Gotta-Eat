import java.awt.Button;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.swing.JFrame;

public class Frame {
	
	private static Button button;
	private static Board b;
	
	public static void main(String[] args) throws IOException {
		
		b = new Board();
		
		JFrame frame = new JFrame();
		frame.setTitle("Platformer");
		frame.add(b);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(544, 360);
		frame.setLocationRelativeTo(null);
		//frame.setLayout(new GridBagLayout());
		frame.setResizable(false);
		frame.setVisible(true);

		button = new Button("Click Me");
		
		//frame.getContentPane().add(new Board("asset\\FinalTitle.jpg"));
		
		frame.add(button);
		
		
		
	}
	
}
