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
import ums.coreclasses.Course;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_53_A_Delete_Course_Controller implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private TextField courseCodeTF;
    @FXML
    private TextField courseTitleTF;
    @FXML
    private TextField courseCreditTF;
    @FXML
    private TextField courseCreditHourTF;
    @FXML
    private Button searchButton;
    @FXML
    private TextField searchTF;
    @FXML
    private TextField deptTF;
    @FXML
    private Button deleteButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    Course c = null;
    @FXML
    private void searchButtonHandler(ActionEvent event) {
        String cCode = searchTF.getText();
        c = UmsFile.courseList.get(cCode);
        
        courseCodeTF.setText(c.getCourseCode());
        courseTitleTF.setText(c.getCourseTitle());
        courseCreditTF.setText(c.getCourseCredit()+"");
        courseCreditHourTF.setText(c.getCourseCreditHour()+"");
        deptTF.setText(c.getDepartment().getCode());
    }

    @FXML
    private void deleteButtonHandler(ActionEvent event) throws IOException {
        UmsFile.courseList.remove(searchTF.getText());
        ActionEvent ev = new ActionEvent();
        backButtonHandler(ev); 
    }
    
    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {
        backButton.getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Page_7_A_Course.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Admin");
        stage.show();
    }
}
