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
public class Page_63_A_Delete_Section_Controller implements Initializable {

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
    @FXML
    private TextField searchTF;
    @FXML
    private Button searchButton;
    @FXML
    private Button deleteButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void deleteButtonHandler(ActionEvent event) throws IOException {
        UmsFile.sectionList.remove(Integer.parseInt(searchTF.getText()));
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
