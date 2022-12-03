package com.onpremiss.pos.controller;

import com.onpremiss.pos.db.Database;
import com.onpremiss.pos.model.Customer;
import com.onpremiss.pos.view.tm.CustomerTm;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Observable;

public class CustomerFormController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtSalary;

public void initialize(){
    searchCustomer();
}
 private void searchCustomer(){
     ObservableList<CustomerTm>
 }


    public void saveCustomerOnAction(ActionEvent actionEvent) {
        Customer c1 = new Customer(txtId.getText(),txtName.getText(),txtAddress.getText(), Double.parseDouble(txtSalary.getText()));
        boolean isSaved =  Database.customerTable.add(c1);
        if (isSaved){
            new Alert(Alert.AlertType.INFORMATION,"Customer Saved!").show();

        }else {
            new Alert(Alert.AlertType.WARNING,"Try Again !").show();
        }

    }
}
