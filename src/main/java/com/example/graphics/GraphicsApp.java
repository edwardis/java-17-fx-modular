package com.example.graphics;

import com.example.calculator.Calculator;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

public class GraphicsApp extends Rectangle {

    Calculator rect = new Rectangle();


    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("graphicsApp.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            GridPane root = new GridPane();
            GridPane.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, null, new BorderWidths(5))));
            GridPane.setPadding(new Insets(7, 7, 7, 7)); GridPane.setGridLinesVisible(true); GridPane.setHgap(5);
            GridPane.setVgap(10);

            final Label label1 = new Label("Label1");
            final TextField textfield1 = new TextField();
            final Label label2 = new Label("Label2");
            final TextField textfield2 = new TextField();
            final Button button = new Button("Button");

            GridPane.add(label1, 0, 0);
            GridPane.add(textfield1, 1, 0);
            GridPane.add(label2, 0, 1);
            GridPane.add(textfield2, 1, 1);
            GridPane.add(button, 1, 2);
            return GridPane;

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
