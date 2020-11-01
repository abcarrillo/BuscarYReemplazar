package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Pantalla extends GridPane{
	
	public Pantalla() {
		
		prefHeight(Double.MAX_VALUE);
		prefWidth(Double.MAX_VALUE);
		//setGridLinesVisible(true);
		int widthBtn = 100;
		int checkWidth = 130;
		
		setHgap(8);
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
		buscarBtn.setPrefWidth(widthBtn);
		Label reemplazar = new Label("Reemplazar con: ");
		reemplazar.setPrefWidth(100);
		TextField reemplazarText = new TextField();
		reemplazarText.setPrefWidth(250);
		Button reemplazarBtn = new Button("Reemplazar");
		reemplazarBtn.setPrefWidth(widthBtn);
		Button todo = new Button("Reemplazar todo");
		todo.setPrefWidth(widthBtn);
		Button cerrarBtn = new Button("Cerrar");
		cerrarBtn.setPrefWidth(widthBtn);
		Button ayudaBtn = new Button("Ayuda");
		ayudaBtn.setPrefWidth(widthBtn);
		CheckBox check1 = new CheckBox("Mayúsculas y minúsculas");
		check1.setPrefWidth(checkWidth);
		CheckBox check2 = new CheckBox("Buscar hacia atrás");
		check2.setPrefWidth(checkWidth);
		CheckBox check3 = new CheckBox("Expresión regular");
		check3.setPrefWidth(checkWidth);
		CheckBox check4 = new CheckBox("Resaltar resultados");
		check4.setPrefWidth(checkWidth);
		
		HBox cajaBuscar = new HBox();
		cajaBuscar.setAlignment(Pos.CENTER);
		cajaBuscar.getChildren().addAll(buscar, buscarText);
		
		HBox cajaReemplazar = new HBox();
		cajaReemplazar.setAlignment(Pos.CENTER);
		cajaReemplazar.getChildren().addAll(reemplazar, reemplazarText);
		
		HBox cajaCheckbox = new HBox();
		cajaCheckbox.setAlignment(Pos.CENTER);
		cajaCheckbox.getChildren().addAll(check1, check2);
		HBox cajaCheckbox2 = new HBox();
		cajaCheckbox2.setAlignment(Pos.CENTER);
		cajaCheckbox2.getChildren().addAll(check3, check4);

		panel1.getChildren().addAll(cajaBuscar, cajaReemplazar, cajaCheckbox, cajaCheckbox2);
		panel2.getChildren().addAll(buscarBtn, reemplazarBtn, todo, cerrarBtn, ayudaBtn);
		
		add(panel1, 0, 0, 10, 1);
		add(panel2, 11, 0, 2, 1);
	}
}
