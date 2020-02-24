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
public class ChatAcumulator {
    private static  ArrayList<Node> Chats;
    private int id;
    private static ArrayList<String> HistorialChats;
    private static int NumeroChat=0;
    private static ScrollPane scroll=null;
    private static AnchorPane anchor=null;
   private ChatAcumulator(ScrollPane scroll,AnchorPane anchor){
        if(NumeroChat==0){
           ChatAcumulator.scroll=scroll;
           ChatAcumulator.anchor=anchor;
        }
        NumeroChat++;
        id=NumeroChat;//Potencial Error
       Button btn=WidgetCreation.CreateButton("chat");
       btn.setOnAction(e -> ButtonAction());
       ChatAcumulator.anchor.getChildren().add(btn);
       double TOP=10.0+10.0*this.id;
       LayoutNewContent.Add(ChatAcumulator.anchor,btn,TOP,0.0,0.0,25.0);
    }
    public static void Creator(ScrollPane scroll,AnchorPane anchor){
       if(ChatAcumulator.NumeroChat<10){
           new ChatAcumulator(scroll,anchor);
       }
    }
    public void ButtonAction(){
       ChatAcumulator.scroll.setContent(ChatAcumulator.Chats.get(this.id-1));

    }


}
