package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController  {
    public Label lblTitle;

    public TextField txtInput;


    public void btnClickOnAction(ActionEvent actionEvent) {
        txtInput.getText();

        lblTitle.setText(txtInput.getText());
    }
}
