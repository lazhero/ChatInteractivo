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
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
public class ChatAcumulator {
    private static  ArrayList<AnchorPane> Chats=new ArrayList<AnchorPane>();
    private static Button[] ArrayButton={new Button("chat 1"),new Button("Chat 2"),new Button("Chat 3"),new Button("Chat 4"),new Button("Chat 5"),new Button("Chat 6"),new Button("Chat 7")};
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
       String Texto ="Chat "+ Integer.toString(id);
       Button btnk=new Button(Texto);
      btnk.setOnAction(e->this.ButtonAction());

       AnchorPane panel=LayoutCreation.Anchor(400.0,10000.0);
       System.out.println("Hecho");
       Chats.add(panel);
       double TOP=10.0+60*this.id;
       System.out.println(id);
       btnk.setOnAction(e -> ButtonAction());
       btnk.setShape(new Circle(40));
       btnk.setStyle("-fx-background-color: #44ff4e; ");
       LayoutNewContent.Add(ChatAcumulator.anchor,btnk,TOP,0.0,0.0,25.0);
       System.out.println("Hecho");
    }
    public static void Creator(ScrollPane scroll,AnchorPane anchor){
       if(ChatAcumulator.NumeroChat<7){
          ChatAcumulator Btn= new ChatAcumulator(scroll,anchor);
       }
    }
    private void ButtonAction(){
           ChatAcumulator.scroll.setContent(ChatAcumulator.Chats.get(this.id - 1));


    }


}
