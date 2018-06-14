import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.*;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

public class FrameTest {

	private static URL M;
	private static String L;


	public FrameTest() 
	{
		M = getClass().getResource("asset/Monkey Noise.wav");
		JFrame frame = new JFrame("danky kang");
		frame.add(new Game());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1088,640);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

	
	}
	
	public static void music()
	{
		AudioPlayer MGP = AudioPlayer.player;
		AudioStream BGM;
		AudioData MD;
		ContinuousAudioDataStream loop = null;
		try {
		BGM = new AudioStream(new FileInputStream("asset/Monkey Noise.wav"));
		MD = BGM.getData();
		loop = new ContinuousAudioDataStream(MD);
		}catch(IOException error) {}
		
		MGP.start(loop);
	}
}