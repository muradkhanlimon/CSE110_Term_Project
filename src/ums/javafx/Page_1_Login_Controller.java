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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_1_Login_Controller implements Initializable {

    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private ChoiceBox<String> loginChoiceBox;
    private String[] userType = {"STUDENT", "FACULTY", "ADMIN", "STAFF"};
    @FXML
    private TextField loginTextField;
    @FXML
    private PasswordField loginPasswordField;
    @FXML
    private Button loginButton;
    @FXML
    private Button forgetPasswordButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loginChoiceBox.setValue(userType[2]);
        loginChoiceBox.getItems().addAll(userType);
    }    

    @FXML
    private void login(ActionEvent event) throws IOException {
        
        String userType = loginChoiceBox.getValue();
        String userName = loginTextField.getText();
        String password = loginPasswordField.getText();        
        
        switch (userType) {
            case "ADMIN":   
                            if( UmsFile.adminList.containsKey(userName) &&
                                userName.equals(UmsFile.adminList.get(userName).getUserId()) &&
                                password.equals(UmsFile.adminList.get(userName).getUserPassword()) &&
                                "ACTIVATED".equals(UmsFile.adminList.get(userName).getUserStatus())
                               ){
                                
                                loginButton.getScene().getWindow().hide();
                                Parent parent = FXMLLoader.load(getClass().getResource("Page_2_AdminMenu.fxml"));
                                Scene scene = new Scene(parent);
                                Stage stage = new Stage();
                                stage.setScene(scene);
                                stage.setTitle("Admin");
                                stage.show();
                                
                            } else {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setTitle("Message");
                                alert.setHeaderText(null);
                                alert.setContentText("Invalid Credentials.");
                                alert.showAndWait();
                            }
            break;
        }//switch ends

    }

    @FXML
    private void resetPassword(ActionEvent event) {
    }
    
}
