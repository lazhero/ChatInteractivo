package Graficos;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;




public class Graficos extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ///primaryStage.setMaxWidth(100.0);
        ///primaryStage.setMaxHeight(500.0);
        ///primaryStage.setResizable(false);
        Text text = new Text();
        text.setText("Hello !! Welcome to JavaTPoint");
        StackPane root = new StackPane();
        Scene scene = new Scene(root,1000,400);
        root.getChildren().add(text);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Text Example");
        primaryStage.show();



    }
}
