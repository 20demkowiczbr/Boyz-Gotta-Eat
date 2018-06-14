

import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FinalScreen {
	
	JLabel contentPane;
	
	public FinalScreen() 
	{
		JFrame frame = new JFrame("danky kang");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(544,320);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		contentPane = new JLabel("Game Over", SwingConstants.CENTER);
		contentPane.setFont(new Font("Roboto", Font.BOLD, 40));
		contentPane.setLayout(new GridBagLayout());
		//contentPane.add(text);
		frame.setContentPane(contentPane);
	}
}
