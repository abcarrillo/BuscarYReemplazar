package app;


import controller.MenuController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
MenuController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		controller = new MenuController();
		
		Scene escena = new Scene(controller.getPantalla(), 520, 200);
		
		Stage stage = new Stage();
		stage.setTitle("Buscar y reemplazar");
		stage.setScene(escena);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
