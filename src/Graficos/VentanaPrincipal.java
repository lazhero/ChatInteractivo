package Graficos;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
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




public class VentanaPrincipal extends Application {
    private ArrayList<Node> Chats;
    private ArrayList<String> HistorialChats;
    private int NumeroChat=0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VentanaPrincipal ventana=new VentanaPrincipal();
        AnchorPane FirstLevelAnchorPane=LayoutCreation.Anchor(800,300);
        Rectangle rectSecondLevel=WidgetCreation.CreateRec(7.0,7.0,300,583);
        ScrollPane SecondLevelScrollPane=LayoutCreation.scroll(440,500);
        //Button ADDBUTTON
        AnchorPane ThridLevelAnchorPane=LayoutCreation.Anchor(400,10000);
        LayoutNewContent.Add(FirstLevelAnchorPane,SecondLevelScrollPane,20.0,0.0,0.0,320.0);
        FirstLevelAnchorPane.getChildren().add(rectSecondLevel);
        LayoutNewContent.Update(SecondLevelScrollPane,ThridLevelAnchorPane);
        Scene scene=new Scene(FirstLevelAnchorPane,800,600,Color.BLUE);
       // Scene scene2= new Scene(SecondLevel,400,440,Color.RED);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    public void CrearChat(){

    }




}
