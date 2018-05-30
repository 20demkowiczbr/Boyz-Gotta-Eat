import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.*;

public class TitleScreen extends Application {
	
	public void start(Stage stage) throws Exception{
		
		BorderPane layout = new BorderPane();
		Scene scene = new Scene(layout, 680, 480);
		
		Button startButton = new Button();
		layout.setCenter(startButton);
		
		startButton.setText("Start");
		
		final Image titleScreen = new Image("Resources\\bg.jpg");
			
			final ImageView titleNode = new ImageView();
			titleNode.setImage(titleScreen);
			
			stage.setTitle("TBD");
			stage.getIcons().add(titleScreen);
			
	}
	//680x480
}
