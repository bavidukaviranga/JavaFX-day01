package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.User;

public class HelloController  {
//    public Label lblTitle;

//    public TextField txtInput;
    public PasswordField txtPassword;
    public TextField txtEmail;




    public void btnRemove(ActionEvent actionEvent) {
        
    }

    public void btnLoginOnaction(ActionEvent actionEvent) {
        String email = txtEmail.getText();
        System.out.println( email);
        String password = txtPassword.getText();
        System.out.println(password);

        User user= new User(email,password);
        System.out.println(user);

    }
}
