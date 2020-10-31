package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Pantalla extends GridPane{
	
	public Pantalla() {
		
		prefHeight(Double.MAX_VALUE);
		prefWidth(Double.MAX_VALUE);
		setGridLinesVisible(true);
		
		setHgap(10);
		setVgap(5);
		setPadding(new Insets(10, 10, 10, 10));
		VBox panel1 = new VBox();
		panel1.setPrefWidth(Double.MAX_VALUE);
		VBox panel2 = new VBox();
		panel2.setPrefWidth(Double.MAX_VALUE);
		
		
		
		Label buscar = new Label("Buscar: ");
		buscar.setPrefWidth(100);
		TextField buscarText = new TextField();
		buscarText.setPrefWidth(250);
		Button buscarBtn = new Button("Buscar");
		//buscarBtn.setPrefWidth(110);
		
		HBox cajaBuscar = new HBox();
		cajaBuscar.setAlignment(Pos.CENTER);
		cajaBuscar.getChildren().addAll(buscar, buscarText);
		
		Label reemplazar = new Label("Reemplazar con: ");
		TextField reemplazarText = new TextField();
		Button reemplazarBtn = new Button("Reemplazar");
		Button todo = new Button("Reemplazar todo");
		Button cerrarBtn = new Button("Cerrar");
		Button ayudaBtn = new Button("Ayuda");

		panel1.getChildren().addAll(cajaBuscar);
		panel2.getChildren().addAll(buscarBtn);
		
		add(panel1, 0, 0, 10, 1);
		add(panel2, 11, 0, 2, 1);
	}
}
