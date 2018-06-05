import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;

public class Player extends Sprite{
	
	private UserInput input;
	private double speed;
	
	public Player(StackPane pane, Image image, double x, double y, double r, double dx, double dy, double dr, double health, UserInput input) {
		super(pane, image, x, y, r, dx, dy, dr, health);
		this.speed = speed;
		this.input = input;
	}
}
