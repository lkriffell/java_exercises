package exercises.m06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageDisplay extends Application {

	@Override
	public void start(Stage primaryStage) {
		ImageView imageView = new ImageView("/textures/texture.png");
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		StackPane pane = new StackPane();
		pane.getChildren().add(imageView);
		pane.getChildren().add(new Button("OK"));
		Scene scene = new Scene(pane, 200, 50);
		primaryStage.setTitle("MyJavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
