import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TitleScreen extends Application {
	
	public void start(Stage stage) throws Exception{
			final Image titleScreen = new Image("asset/Stegosaurus.jpg");
			
			final ImageView titleNode = new ImageView();
			titleNode.setImage(titleScreen);
			
			stage.setTitle("TBD");
			stage.getIcons().add(titleScreen);
	}
	//340x240
}
