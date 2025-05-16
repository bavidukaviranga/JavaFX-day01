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
    public Label lblSuccess;


    public void btnRemove(ActionEvent actionEvent) {
        
    }

    public void btnLoginOnaction(ActionEvent actionEvent) {
        final String email= "saman@gmail.com";
        final String password = "1234@ssd";

        String txtEmailText = txtEmail.getText();
        String txtPasswordText = txtPassword.getText();



        User user= new User(txtEmailText,txtPasswordText);
        System.out.println(user);

        if (email.equals(txtEmailText)){
            if (password.equals(txtPasswordText)){
                lblSuccess.setText("Login Successfully");
            }else {
                lblSuccess.setText("Login Fail");
            }
        }else {
            lblSuccess.setText("Login Fail");
        }


    }
}
