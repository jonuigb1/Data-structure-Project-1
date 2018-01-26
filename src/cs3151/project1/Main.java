package cs3151.project1;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	private static final String GUI_RESOURCE = "view/MainWindow.fxml";

	@Override
	public void start(Stage primaryStage) throws Exception {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		URL resource = classLoader.getResource(Main.GUI_RESOURCE);
		FXMLLoader loader = new FXMLLoader(resource);
		primaryStage.setTitle("Benzel Project 1");
		Parent root = (Parent) loader.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
