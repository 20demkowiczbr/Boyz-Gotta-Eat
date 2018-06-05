import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;


//https://stackoverflow.com/questions/29057870/in-javafx-how-do-i-move-a-sprite-across-the-screen

public class Sprite {
	private List<Image> avatar;
	public static int count;
	
	public Sprite(Image phase1, Image phase2, Image phase3) {
		avatar = new ArrayList<Image>();
		avatar.add(phase1);
		avatar.add(phase2);
		avatar.add(phase3);
		count = 0;
		//random commit
	}
	
	public Image animateWalk() {
		if(count < avatar.size()-1)
			count++;
		else
			count = 0;
		
		return avatar.get(count);
	}
}
