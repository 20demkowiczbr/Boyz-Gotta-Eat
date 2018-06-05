import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public abstract class Level {
	Image background;
	StackPane pane;
	
	public Level(Image bg) {
		background = bg;
		makePane();
	}
	
	public Scene setScene() {
		Scene levelScene = new Scene(pane, 680, 480);
		return levelScene;
	}
	
	public Image getBG() {
		return background;
	}
	
	public void makePane() {
		StackPane levelPane = new StackPane();
		ImageView newBack = new ImageView();
		newBack.setImage(getBG());
		levelPane.getChildren().addAll(newBack);
		pane = levelPane;
	}
	
	public StackPane getPane() {
		return pane;
	}
	
}
