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
import ums.coreclasses.Search;
import ums.coreclasses.Section;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_62_A_Update_Section_Controller implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private TextField secIdTF;
    @FXML
    private TextField secNameTF;
    @FXML
    private TextField secYearTF;
    @FXML
    private ChoiceBox<String> secCourseCB;
    @FXML
    private ChoiceBox<String> secInsCB;
    @FXML
    private ChoiceBox<String> secSemCB;
    private String[] sem = {"Spring", "Summer", "Fall"};
    @FXML
    private TextField searchTF;
    @FXML
    private Button searchButton;
    @FXML
    private Button updateButton;

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

    Section s = null;
    @FXML
    private void searchButtonHandler(ActionEvent event) {
        int id = Integer.parseInt(searchTF.getText());
        s = UmsFile.sectionList.get(id);
        
        secIdTF.setText(s.getId()+"");
        secNameTF.setText(s.getSectionName()+"");
        secSemCB.setValue(s.getSemester()+"");
        secYearTF.setText(s.getYear()+"");
        secCourseCB.setValue(s.getCourse().getCourseCode());
        secInsCB.setValue(s.getInstructor().getUserId());
    }

    @FXML
    private void updateButtonHandler(ActionEvent event) throws IOException {
        s.setId(Integer.parseInt(secIdTF.getText()));
        s.setSectionName(Integer.parseInt(secNameTF.getText()));
        s.setSemester(secSemCB.getValue());
        s.setYear(Integer.parseInt(secYearTF.getText()));
        s.setCourse(Search.searchCourseByCode(secCourseCB.getValue()));
        s.setInstructor(Search.searchInstructorById(secInsCB.getValue()));
        
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
