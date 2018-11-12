package sample;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Observer;

public class Controller {
    DbConnector dbConnector = new DbConnector();

    public void initialize(){
        dbConnector.connect();
    }

}
