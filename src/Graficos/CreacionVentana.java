package Graficos;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;




public class CreacionVentana extends Application {
    private Stage stage;
    private StackPane root;
    private Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane FirstLevel=new Pane();
        Button btn=WidgetCreation.CreateButton("Prueba");
        Button btn2=WidgetCreation.CreateButton("Prueba2");
        Rectangle rect=WidgetCreation.CreateRec(0.0,0.0,150,600);
        VBox SecondLevel=new VBox(btn,btn2);
        FirstLevel.getChildren().addAll(rect,SecondLevel);
        Scene scene=new Scene(FirstLevel,800,600,Color.BLUE);
       // Scene scene2= new Scene(SecondLevel,400,440,Color.RED);
        primaryStage.setScene(scene);
        primaryStage.show();

    }



}
