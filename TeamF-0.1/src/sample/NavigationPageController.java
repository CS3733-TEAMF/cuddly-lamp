package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class NavigationPageController {
    @FXML
    private TextField email;

    @FXML
    private TextField destination;

    @FXML
    private CheckBox stairs;

    @FXML
    private  CheckBox elevator;

    @FXML
    public void go(){

    }

    @FXML
    public void clear(){

    }

    @FXML
    public void sendMsg(){

    }
    @FXML
    public void back(){
        Main.startScreen();
    }
}
