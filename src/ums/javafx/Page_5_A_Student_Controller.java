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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_5_A_Student_Controller implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private Button addButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button updateButton;
    @FXML
    private Button viewButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addButtonHandler(ActionEvent event) throws IOException {
        
        addButton.getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Page_31_A_Add_Student.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Admin");
        stage.show();
    }
    
    @FXML
    private void updateButtonHandler(ActionEvent event) throws IOException {
            
        updateButton.getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Page_32_A_Update_Student.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Admin");
        stage.show();
    }

    @FXML
    private void deleteButtonHandler(ActionEvent event) throws IOException {
        deleteButton.getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Page_33_A_Delete_Student.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Admin");
        stage.show();
    }

    @FXML
    private void viewButtonHandler(ActionEvent event) throws IOException {
        
        viewButton.getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Page_34_A_View_Student.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Admin");
        stage.show();
    }
    
    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {
        
            backButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_2_AdminMenu.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin");
            stage.show();
    }
    
}
