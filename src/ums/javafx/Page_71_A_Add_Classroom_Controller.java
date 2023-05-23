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
import ums.coreclasses.Classroom;
import ums.coreclasses.Generator;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_71_A_Add_Classroom_Controller implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private TextField idTF;
    @FXML
    private TextField buildingTF;
    @FXML
    private TextField roomNumberTF;
    @FXML
    private TextField capacityTF;
    @FXML
    private Button createButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void createButtonHandler(ActionEvent event) throws IOException {
        int id = Generator.genClassroomSerial();
        String building = buildingTF.getText();
        int roomNumber = Integer.parseInt(roomNumberTF.getText());
        int capacity = Integer.parseInt(capacityTF.getText());
        
        Classroom c = new Classroom(
                                    id,
                                    building,
                                    roomNumber,
                                    capacity
        );
        
        UmsFile.classroomList.put(id, c);
        
        ActionEvent ev = new ActionEvent();
        backButtonHandler(ev);
    }
    
    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {
        backButton.getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Page_9_A_Classroom.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Admin");
        stage.show();
    }
    
}
