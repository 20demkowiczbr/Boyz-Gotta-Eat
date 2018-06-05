import java.io.File;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import com.sun.glass.ui.Application;
import com.sun.glass.ui.CommonDialogs.ExtensionFilter;
import com.sun.glass.ui.CommonDialogs.FileChooserResult;
import com.sun.glass.ui.Cursor;
import com.sun.glass.ui.Pixels;
import com.sun.glass.ui.Robot;
import com.sun.glass.ui.Screen;
import com.sun.glass.ui.Size;
import com.sun.glass.ui.Timer;
import com.sun.glass.ui.View;
import com.sun.glass.ui.Window;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

public class LevelSelector extends Application{

	public void start(Stage stage) throws Exception{
	
		final Image map = new Image("asset/map.png");
		final ImageView mapNode = new ImageView();
		mapNode.setImage(map);
		
		Group node = new Group();
		Scene scene = new Scene(node, 680, 480);
		stage.setScene(scene);
		
		node.getChildren().addAll(mapNode);
		
		 Button arcticButton = new Button();
			
			arcticButton.setText("Arctic");

		StackPane pane = new StackPane();
		pane.getChildren().addAll(node, arcticButton);
		
		//StackPane pane = new StackPane();
		//pane.getChildren().addAll(mapNode);
		arcticButton.setOnAction(new EventHandler<ActionEvent>(){
			@Override
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
		
		
		
		stage.show();
	}
	

	@Override
	protected void runLoop(Runnable launchable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void _invokeAndWait(Runnable runnable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void _invokeLater(Runnable runnable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Object _enterNestedEventLoop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void _leaveNestedEventLoop(Object retValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Window createWindow(Window owner, Screen screen, int styleMask) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Window createWindow(long parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View createView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cursor createCursor(int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cursor createCursor(int x, int y, Pixels pixels) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void staticCursor_setVisible(boolean visible) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Size staticCursor_getBestSize(int width, int height) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pixels createPixels(int width, int height, ByteBuffer data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pixels createPixels(int width, int height, IntBuffer data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pixels createPixels(int width, int height, IntBuffer data, float scale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected int staticPixels_getNativeFormat() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Robot createRobot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected double staticScreen_getVideoRefreshPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected Screen[] staticScreen_getScreens() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Timer createTimer(Runnable runnable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected int staticTimer_getMinPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int staticTimer_getMaxPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected FileChooserResult staticCommonDialogs_showFileChooser(Window owner, String folder, String filename,
			String title, int type, boolean multipleMode, ExtensionFilter[] extensionFilters, int defaultFilterIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected File staticCommonDialogs_showFolderChooser(Window owner, String folder, String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected long staticView_getMultiClickTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int staticView_getMultiClickMaxX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int staticView_getMultiClickMaxY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected boolean _supportsTransparentWindows() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean _supportsUnifiedWindows() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected int _getKeyCodeForChar(char c) {
		// TODO Auto-generated method stub
		return 0;
	}
}
