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
import ums.coreclasses.Course;
import ums.coreclasses.Search;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_52_A_Update_Course_Controller implements Initializable {

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
    //@FXML
    //private TextField prerequisiteTF;
    @FXML
    private ChoiceBox<String> deptChoiceBox;
    @FXML
    private Button searchButton;
    @FXML
    private TextField searchTF;
    @FXML
    private Button updateButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
        deptChoiceBox.setValue(c.getDepartment().getCode());
    }

    @FXML
    private void updateButtonHandler(ActionEvent event) throws IOException {
        String cCode = courseCodeTF.getText();
        String cTitle = courseTitleTF.getText();
        float cCredit = Float.parseFloat(courseCreditTF.getText());
        float cCreditHour = Float.parseFloat(courseCreditHourTF.getText());
        //String prerequisite = prerequisiteTF.getText();
        String dept = deptChoiceBox.getValue();
        
        c.setCourseCode(cCode);
        c.setCourseTitle(cTitle);
        c.setCourseCredit(cCredit);
        c.setCourseCreditHour(cCreditHour);
        c.setDepartment(Search.searchDepartmentByCode(dept));
        
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
