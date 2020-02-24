package Graficos;
import java.util.ArrayList;
import java.util.concurrent.atomic.LongAccumulator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
      final AnchorPane FirstLevelAnchorPanel=LayoutCreation.Anchor(800.0,600.0);
       Rectangle rectSecondLevel=WidgetCreation.CreateRec(10.0,10.0,300.0,550.0);
       final ScrollPane SecondLevelScrollPane=LayoutCreation.scroll(400.0,550.0);
       Button btn=WidgetCreation.CreateButton("+");
       boolean confirmacion=false;
        btn.setOnAction(e->
                ChatAcumulator.Creator(SecondLevelScrollPane,FirstLevelAnchorPanel)
        );
       //AnchorPane ThridLevelAnchorPanel=LayoutCreation.Anchor(400.0,10000.0);
       LayoutNewContent.Add(FirstLevelAnchorPanel,SecondLevelScrollPane,20.0,0.0,0.0,350.0);
       LayoutNewContent.Add(FirstLevelAnchorPanel,btn,0.0,10.0,20.0,0.0);
       FirstLevelAnchorPanel.getChildren().add(rectSecondLevel);
       Scene scene=new Scene(FirstLevelAnchorPanel,800,600.0, Color.BLACK);
       primaryStage.setScene(scene);
       primaryStage.show();

    }



}
