package LogicGame.UI_Controls;

import LogicGame.Game;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class numberBar {

    public GridPane show(){
        GridPane nBar = new GridPane();
        nBar.setHgap(7);
        nBar.setVgap(7);

        for (int row = 0; row <= 3; row ++){
            for (int column = 0; column <=2; column ++){
                if (row == 3 && column == 1) continue;
                int number = 7 - row*3 + column;
                StackPane grid;
                int size = 1;
                if (row == 3)  {
                    if (column == 0){
                        grid = oneGrid(0,2,false);
                        size = 2;
                    }else {
                        grid = oneGrid(-1,1,true);
                    }
                }
                else {
                    grid = oneGrid(number,1,false);
                }
                nBar.add(grid,column,row,size,1);
            }
        }

        return nBar;
    }

    private static StackPane oneGrid(int i, int size, boolean del){
        StackPane stackPane = new StackPane();

        Rectangle square = new Rectangle(35 * size, 35);
        square.setArcHeight(7);
        square.setArcWidth(7);
        square.setStrokeType(StrokeType.OUTSIDE);
        square.setStroke(Color.BLACK);
        square.setStrokeWidth(0.7);
        square.setFill(Color.WHITE);

        HBox hBox = new HBox();
        Text number;
        if (del){
            number = new Text("Del");

        }else {
            number = new Text(Integer.toString(i));
        }
        number.setFont(Font.font("Tahoma", FontWeight.NORMAL,18));
        hBox.getChildren().add(number);
        hBox.setAlignment(Pos.CENTER);

        stackPane.setOnMouseClicked(event -> {
            if (del) {
                // del is true
                Game.nBarInput2();
            } else {
                // otherwise
                Game.nBarInput1(i);
            }
        });
        stackPane.setCursor(Cursor.HAND);

        stackPane.getChildren().addAll(square,hBox);

        return stackPane;
    }
}
