package LogicGame;

import LogicGame.UI_Controls.numberBar;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * This is a JavaFX application that gives a graphical user interface (GUI) to
 * Sudoku game.
 */

public class Game extends Application {


    private static final int BOARD_WIDTH = 1280;
    private static final int BOARD_HEIGHT = 720;

    private static final int DIFFICULTY = 0;

    // main
    private Stage primaryStage = new Stage();
    private BorderPane borderMain = new BorderPane();

    // right
    private GridPane NUMBAR = new GridPane();

    @Override
    public void start(Stage primaryStage) {
        primaryStage = this.primaryStage;
        primaryStage.setTitle("Sudoku");
        main();
        primaryStage.show();
    }

    private void main(){
        borderMain = new BorderPane();
        Scene main = new Scene(borderMain, BOARD_WIDTH, BOARD_HEIGHT);
        primaryStage.setScene(main);


        borderMain.setRight(right());
    }


    private VBox right(){
        VBox right = new VBox();
        right.setSpacing(60);
        right.setAlignment(Pos.CENTER);
        right.setPadding(new Insets(0,10,0,0));

        String diff;
        switch (DIFFICULTY){
            case 0:
                diff = "Practise";
                break;
            case 1:
                diff = "Easy";
                break;
            case 2:
                diff = "Mid";
                break;
            case 3:
                diff = "Advanced";
                break;
            default:
                diff = "Professor";
        }
        Text text = new Text("Current Difficulty:\n\t" + diff);
        text.setFont(Font.font("Times New Roman", FontWeight.NORMAL,18));

        numberBar numberBar = new numberBar();
        NUMBAR = numberBar.show();
        NUMBAR.setDisable(true);

        right.getChildren().addAll(text,NUMBAR);
        return right;
    }
    public static void nBarInput1(int i){

    }

    public static void nBarInput2(){

    }

}