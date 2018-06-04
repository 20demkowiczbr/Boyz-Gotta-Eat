import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public abstract class Level {
	Image background;
	
	public Level(Image bg) {
		background = bg;
	}
	
	public void setPane() {
		StackPane levelPane = new StackPane();
		ImageView newBack = new ImageView();
		newBack.setImage(getBG());
	}
	
	public Image getBG() {
		return background;
	}
	
}
