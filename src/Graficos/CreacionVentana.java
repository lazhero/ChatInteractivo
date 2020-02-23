package Graficos;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
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

        AnchorPane FirstLevel=new AnchorPane();
        Button btn=WidgetCreation.CreateButton("Prueba ");
        Button btn2=WidgetCreation.CreateButton("Prueba 2");
        Button btn3=WidgetCreation.CreateButton("prueba 3");
        Button btn4= WidgetCreation.CreateButton("prueba 4");
        Rectangle rect=WidgetCreation.CreateRec(0.0,0.0,300,600);
        rect.setFill(Color.GREEN);
        rect.setArcHeight(40);
        rect.setArcWidth(40);
        VBox SecondLevel=new VBox(btn,btn2,btn3);

        SecondLevel.getChildren().add(btn4);
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setPrefViewportWidth(400);
        scrollPane.setPrefViewportHeight(400);
        scrollPane.setContent(SecondLevel);
        scrollPane.fitToWidthProperty().set(false);
        scrollPane.fitToHeightProperty().set(false);
        FirstLevel.getChildren().addAll(rect,scrollPane);
        FirstLevel.setTopAnchor(SecondLevel,20.0);
        FirstLevel.setLeftAnchor(scrollPane,350.0);
        Scene scene=new Scene(FirstLevel,800,600,Color.BLUE);
       // Scene scene2= new Scene(SecondLevel,400,440,Color.RED);
        primaryStage.setScene(scene);
        primaryStage.show();

    }



}
