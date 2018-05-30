import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.*;

public class TitleScreen extends Application {
	
	 public static void main(String[] args) {
	        launch(args);
	    }
	 
	public void start(Stage stage) throws Exception{
		
	
		
		final Image titleScreen = new Image("asset/bg.jpg");

			
			final ImageView titleNode = new ImageView();
			titleNode.setImage(titleScreen);
			
			
			Group node = new Group();
			stage.setTitle("TBD");	
			node.getChildren().addAll(titleNode);
			Scene scene = new Scene(node, 680, 480);
			stage.setScene(scene);
				
			GridPane pane = new GridPane();
			pane.setPadding(new Insets(10, 10, 10, 10));
	        pane.setMinSize(300, 300);
	        pane.setVgap(10);
	        pane.setHgap(10);
	
		
		Button startButton = new Button();
		
		startButton.setText("Start");
		node.getChildren().add(pane);
			stage.show();
			
	}
	//680x480
}
