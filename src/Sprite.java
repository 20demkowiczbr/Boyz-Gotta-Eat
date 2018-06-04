import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;

public class Sprite {
	private List<Image> avatar;
	
	public Sprite(Image phase1, Image phase2, Image phase3) {
		avatar = new ArrayList<Image>();
		avatar.add(phase1);
		avatar.add(phase2);
		avatar.add(phase3);
		
		//random commit
	}
}
