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
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_2_AdminMenu_Controller implements Initializable {

    @FXML
    private Button departmentButton;
    @FXML
    private Button instructorButton;
    @FXML
    private Button studentButton;
    @FXML
    private Button staffButton;
    @FXML
    private Button courseButton;
    @FXML
    private Button sectionButton;
    @FXML
    private Button classroomButton;
    @FXML
    private Button timeslotButton;
    @FXML
    private Button logoutButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void departmentButtonHandler(ActionEvent event) throws IOException {
        
            departmentButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_3_A_Department.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin > Department");
            stage.show();
    }
    
    @FXML
    private void instructorButtonHandler(ActionEvent event) throws IOException {
        
            instructorButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_4_A_Instructor.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin > Instructor");
            stage.show();
    }
    
    @FXML
    private void studentButtonHandler(ActionEvent event) throws IOException {
        
            studentButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_5_A_Student.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin > Student");
            stage.show();
    }
    
    @FXML
    private void staffButtonHandler(ActionEvent event) throws IOException {
        
            staffButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_6_A_Staff.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin > Staff");
            stage.show();
    }
    
    @FXML
    private void courseButtonHandler(ActionEvent event) throws IOException {
        
            courseButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_7_A_Course.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin > Course");
            stage.show();
    }
    
    @FXML
    private void sectionButtonHandler(ActionEvent event) throws IOException {
        
            sectionButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_8_A_Section.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin > Section");
            stage.show();
    }
    
    
    @FXML
    private void classroomButtonHandler(ActionEvent event) throws IOException {
        
            classroomButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_9_A_Classroom.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin > Classroom");
            stage.show();
    }
    
    @FXML
    private void timeslotButtonHandler(ActionEvent event) throws IOException {
        
            timeslotButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_10_A_Timeslot.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin > Timeslot");
            stage.show();
    }
    
    @FXML
    private void logoutButtonHandler(ActionEvent event) throws IOException {
            
            UmsFile.saveAndClose();
            logoutButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_1_Login.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("UMS");
            stage.show();
    }
}//Class ends
