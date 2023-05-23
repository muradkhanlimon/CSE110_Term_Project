/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ums.javafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ums.coreclasses.Department;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_11_A_Add_Department_Controller implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private TextField codeTextField;
    @FXML
    private TextField fullNameTextField;
    @FXML
    private TextField budgetTextField;
    @FXML
    private TextField buildingTextField;
    @FXML
    private Button createButton;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void createButtonHandler(ActionEvent event) throws IOException {
        String id       = idTextField.getText();
        String code    = codeTextField.getText();
        String fullName = fullNameTextField.getText();
        double budget   = Double.parseDouble(budgetTextField.getText());
        String building = buildingTextField.getText();
        
        Department d1 = new Department(
                                      id,
                                      code,
                                      fullName,
                                      budget,
                                      building
                                     );
        UmsFile.departmentList.put(code, d1);
        
        ActionEvent ev = new ActionEvent();
        backButtonHandler(ev);
    }
    
    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {
        
            backButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_3_A_Department.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin");
            stage.show();
    }
    
}
