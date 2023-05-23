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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ums.coreclasses.Generator;
import ums.coreclasses.Section;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_61_A_Add_Section_Controller implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private TextField secIdTF;
    @FXML
    private TextField secNameTF;
    @FXML
    private ChoiceBox<String> secSemCB;
    private String[] sem = {"Spring", "Summer", "Fall"};
    @FXML
    private TextField secYearTF;
    @FXML
    private ChoiceBox<String> secCourseCB;
    @FXML
    private ChoiceBox<String> secInsCB;
    @FXML
    private Button crateButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        secSemCB.setValue(sem[0]);
        secSemCB.getItems().addAll(sem);
        
        secCourseCB.getItems().addAll(UmsFile.courseList.keySet());
        secCourseCB.setValue(UmsFile.courseList.keySet().iterator().next());
        
        secInsCB.getItems().addAll(UmsFile.instructorList.keySet());
        secInsCB.setValue(UmsFile.instructorList.keySet().iterator().next());
    }

    @FXML
    private void crateButtonHandler(ActionEvent event) throws IOException {
        int    id           = Generator.genSectionSerial();
        int    sectionName  = Integer.parseInt(secNameTF.getText());
        String semester     = secSemCB.getValue();
        int    year         = Integer.parseInt(secYearTF.getText());
        String course       = secCourseCB.getValue();
        String instructor   = secInsCB.getValue();
        
        Section s = new Section(
        id, sectionName, semester, year, course, instructor
        );
        
        UmsFile.sectionList.put(id, s);
        ActionEvent ev = new ActionEvent();
        backButtonHandler(ev);
    }
    
    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {
        
            backButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_8_A_Section.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin");
            stage.show();
    }
}
