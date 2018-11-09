package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    DbConnector dbConnector = new DbConnector();

    public void initialize(){
        dbConnector.connect();
    }

    public void showText(){
        Label label = new Label(dbConnector.connect().toString());
        TextField a = new TextField();
        a.setPrefSize(70, 50);
    }
}
