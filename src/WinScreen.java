import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WinScreen 
{

	JLabel contentPane;
	
	public WinScreen(int num) 
	{
		JFrame frame = new JFrame("danky kang");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(544,320);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		contentPane = new JLabel(("You Won   Score: " + num), SwingConstants.CENTER);
		contentPane.setFont(new Font("Roboto", Font.BOLD, 40));
		contentPane.setLayout(new GridBagLayout());
		frame.setContentPane(contentPane);
	}
}