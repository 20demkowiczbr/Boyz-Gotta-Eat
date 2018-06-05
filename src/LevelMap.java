import java.util.ArrayList;
import java.util.List;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class LevelMap extends Level {
	ArrayList<Button> mapButtons;
	
	public LevelMap(Image bg) {
		super(bg);
		
		// TODO Auto-generated constructor stub
	}
	
	public void makePane() {
		super.makePane();

		mapButtons = new ArrayList<Button>();
		Button arctic = new Button();
		arctic.setText("Arctic");
		mapButtons.add(arctic);
		
		getPane().getChildren().addAll(mapButtons.get(0));
		
	}
	
	public Button getButton(int index) {
		return mapButtons.get(index);
	}
	
}
