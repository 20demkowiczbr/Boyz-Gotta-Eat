import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;


//https://stackoverflow.com/questions/29057870/in-javafx-how-do-i-move-a-sprite-across-the-screen

public class Sprite {
	private Image avatar;
	private ImageView imageView;
	
	StackPane layer;
	
	double xVal;
	double yVal;
	double rVal;
	
	double dx;
	double dy;
	double dr;
	
	double health;
	
	boolean removable = false;
	boolean canMove = true;
	
	double w;
	double h;
	
	
	public Sprite(StackPane pane, Image image, double x, double y, double r, double dx, double dy, double dr, double health) {
		layer = pane;
		avatar = image;
		xVal = x;
		yVal = y;
		rVal = r;
		this.dx = dx;
		this.dy = dy;
		this.dr = dr;
		
		this.health = health;
		
		imageView = new ImageView(avatar);
		imageView.relocate(xVal, yVal);
		imageView.setRotate(rVal);
		
		w = avatar.getWidth();
		h = avatar.getHeight();
		
		layer.getChildren().addAll(imageView);
	}
	
}
