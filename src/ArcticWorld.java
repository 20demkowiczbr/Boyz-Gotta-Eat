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

public class ArcticWorld {

public void start(Stage stage) throws Exception{
	final Image backdrop = new Image("asset/bg.jpg");
	final ImageView arcticNode = new ImageView();
	arcticNode.setImage(backdrop);
	
	Group node = new Group();
	Scene scene = new Scene(node, 680, 480);
	stage.setScene(scene);
	
	node.getChildren().addAll(arcticNode);

	StackPane pane = new StackPane();
	pane.getChildren().add(node);
	
	//StackPane pane = new StackPane();
	//pane.getChildren().addAll(mapNode);
	
	stage.show();
	}
}
