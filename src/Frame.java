import javax.swing.JFrame;

public class Frame {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Platformer");
		frame.add(new Board());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(544, 360);
		frame.setVisible(true);
		
		//frame.setLayout(new GridBagLayout());
		//frame.setLocationRelativeTo(null);
		//frame.setResizable(false);
		
		
		
	}
	
}
