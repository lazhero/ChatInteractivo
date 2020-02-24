package Graficos;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.jetbrains.annotations.NotNull;

public class WidgetCreation {
    public static Button CreateButton(String text){
        Button button=new Button(text);
        button.setStyle(
                "-fx-background-radius: 5em; " +
                        "-fx-min-width: 30px; " +
                        "-fx-min-height: 30px; " +
                        "-fx-max-width: 30px; " +
                        "-fx-max-height: 30px;"
        );
        return button;
    }
    public static Rectangle CreateRec(double coordX, double coordY, double width, double height){
        Rectangle rect=new Rectangle();
        rect.setX(coordX);
        rect.setY(coordY);
        rect.setWidth(width);
        rect.setHeight(height);
        rect.setFill(Color.GREEN);
        rect.setArcHeight(40);
        rect.setArcWidth(40);
        return rect;
    }
}
