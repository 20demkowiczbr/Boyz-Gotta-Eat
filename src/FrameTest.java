import javax.swing.*;

public class FrameTest {

	public static void main(String[] args)
	{
		new FrameTest();
	}
	
	public FrameTest() 
	{
		JFrame frame = new JFrame("danky kang");
		frame.add(new Game());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1088,640);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}
}
