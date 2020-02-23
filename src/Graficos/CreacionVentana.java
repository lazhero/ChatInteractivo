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
        Pane SecondLevel=new Pane();
        Button btn=WidgetCreation.CreateButton("Prueba");
        Rectangle rect=this.CreateRec(0.0,0.0,150,600);
        FirstLevel.getChildren().addAll(rect);
        SecondLevel.getChildren().addAll(btn);
        Scene scene=new Scene(FirstLevel,800,600,Color.BLUE);
        Scene scene2= new Scene(SecondLevel,400,440,Color.RED);
        primaryStage.setScene(scene,scene2);
        primaryStage.show();

    }
    public Rectangle CreateRec(double coordX,double coordY,double width,double height){
        Rectangle rect=new Rectangle();
        rect.setX(coordX);
        rect.setY(coordY);
        rect.setWidth(width);
        rect.setHeight(height);
        rect.setFill(Color.LIGHTGREEN);
        return rect;
    }

}
