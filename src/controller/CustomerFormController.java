package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import model.Customer;

import java.util.ArrayList;

public class CustomerFormController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtPhone;
    public TextField txtSalary;

    ArrayList<Customer> customerList = new ArrayList<>();

    public void btnAddCustomerOnAction(ActionEvent actionEvent) {
        Integer id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String phone = txtPhone.getText();
        Double salary =Double.parseDouble(txtSalary.getText());


        Customer customer = new Customer(id, name, email, address, phone, salary);

        customerList.add(customer);
    }

    public void btnReloadTableOnAction(ActionEvent actionEvent) {
        customerList.forEach(customer -> {
            System.out.println(customer );
        });


    }
}
