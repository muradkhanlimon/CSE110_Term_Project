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
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_51_A_Add_Course_Controller implements Initializable {

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
    private Button createButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        deptChoiceBox.getItems().addAll(UmsFile.departmentList.keySet());
        deptChoiceBox.setValue(UmsFile.departmentList.keySet().iterator().next());
    }

    @FXML
    private void createButtonHandler(ActionEvent event) throws IOException {
        String cCode = courseCodeTF.getText();
        String cTitle = courseTitleTF.getText();
        float cCredit = Float.parseFloat(courseCreditTF.getText());
        float cCreditHour = Float.parseFloat(courseCreditHourTF.getText());
        //String prerequisite = prerequisiteTF.getText();
        String dept = deptChoiceBox.getValue();
        
        Course c = new Course(
                                cCode,
                                cTitle,
                                cCredit,
                                cCreditHour,
                                //prerequisite,
                                dept
        );
        
        UmsFile.courseList.put(cCode, c);
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
