import javax.swing.JFrame;

public class Frame {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Platformer");
		frame.setSize(544, 360);
		//frame.setLayout(new GridBagLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLocationRelativeTo(null);
		//frame.setResizable(false);
		frame.setVisible(true);
		frame.add(new Board());
		
	}
	
}
