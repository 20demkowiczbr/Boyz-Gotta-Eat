import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class LevelMap extends Level {

	public LevelMap(Image bg) {
		super(bg);
		// TODO Auto-generated constructor stub
	}
	
	public void makePane() {
		super.makePane();
		
		Button arctic = new Button();
		arctic.setText("Arctic");
		getPane().getChildren().addAll(arctic);
		
	}
	
}
