import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.*;

public class TitleScreen extends Application {
	
	 public static void main(String[] args) {
	        launch(args);
	    }
	static Group node;
	static Stage mainStage;
	public void start(Stage stage) throws Exception{
		
		final Image titleScreen = new Image("asset/bg.jpg");

			mainStage = stage;
			final ImageView titleNode = new ImageView();
			titleNode.setImage(titleScreen);
			
			
			node = new Group();
			stage.setTitle("TBD");	
			node.getChildren().addAll(titleNode);
			Scene scene = new Scene(node, 680, 480);
			stage.setScene(scene);
				
			StackPane pane = new StackPane();
		
	        Button startButton = new Button();
		
			startButton.setText("Start");
			
			pane.getChildren().addAll(titleNode, startButton);
			
			node.getChildren().add(pane);
			stage.show();
			
			startButton.setOnAction(new EventHandler<ActionEvent>(){
		           public void handle(ActionEvent event) {
		               LevelSelector map = new LevelSelector();
						try {
							map.start(stage);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		           }
		       });
	}
	//680x480
	
	public static void sceneChanger(Scene newScene) {
		Scene scene = new Scene(node, 680, 480);
		mainStage.setScene(scene);
		
	}
}

