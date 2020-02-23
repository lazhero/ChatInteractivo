package Graficos;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import java.io.FileInputStream;




public class VentanaPrincipal extends Application {
    private  Stage stage;
    private  Scene scene;
    private  StackPane stack;

    public VentanaPrincipal() {
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.stage=primaryStage;
        this.stack=new StackPane();
        this.scene=new Scene(this.stack,1000,400);
        StackPane root = this.stack;
        Scene scene = this.scene;
        //root.getChildren().add(text);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Text Example");
       // primaryStage.
        primaryStage.show();



    }
}
