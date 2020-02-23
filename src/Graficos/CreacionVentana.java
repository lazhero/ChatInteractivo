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
        AnchorPane FirstLevelAnchorPane=LayoutCreation.Anchor(800,600);
        Rectangle rectSecondLevel=WidgetCreation.CreateRec(0.0,0.0,300,600);
        ScrollPane SecondLevelScrollPane=LayoutCreation.scroll(400,500);
        AnchorPane ThridLevelAnchorPane=LayoutCreation.Anchor(400,1000);
        FirstLevelAnchorPane.getChildren().addAll(Rectangle,SecondLevelScrollPane);
        Scene scene=new Scene(FirstLevelAnchorPane,800,600,Color.BLUE);
       // Scene scene2= new Scene(SecondLevel,400,440,Color.RED);
        primaryStage.setScene(scene);
        primaryStage.show();

    }



}
