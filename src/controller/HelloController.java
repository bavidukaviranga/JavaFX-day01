package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class HelloController  {
    public Label lblTitle;



    public void btnClickOnAction(ActionEvent actionEvent) {
      lblTitle.setText("Welcom to Party..! ");
    }
}
