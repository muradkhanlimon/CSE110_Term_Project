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
import ums.coreclasses.Timeslot;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_81_A_Add_Timeslot_Controller implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private TextField startHourTF;
    @FXML
    private TextField startMinTF;
    @FXML
    private TextField endHourTF;
    @FXML
    private TextField endMinTF;
    @FXML
    private ChoiceBox<String> dayChoiceBox;
    private String[] day = {"A", "S", "M", "T", "W", "R", "F", "ST", "SR", "MW", "TR"};
    @FXML
    private Button createButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dayChoiceBox.setValue(day[1]);
        dayChoiceBox.getItems().addAll(day);
    }    

    @FXML
    private void createButtonHandler(ActionEvent event) throws IOException {
        int id = Generator.genTimeslotSerial();
        String day = dayChoiceBox.getValue();
        int startHour = Integer.parseInt(startHourTF.getText());
        int startMin = Integer.parseInt(startMinTF.getText());
        int endHour = Integer.parseInt(endHourTF.getText());
        int endMin = Integer.parseInt(endMinTF.getText());
        
        Timeslot t = new Timeslot(
                                    id,
                                    day,
                                    startHour,
                                    startMin,
                                    endHour,
                                    endMin
        );
        
        UmsFile.timeslotList.put(id, t);
        
        ActionEvent ev = new ActionEvent();
        backButtonHandler(ev);
    }
    
    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {
            backButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_10_A_Timeslot.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin");
            stage.show();
    }
}
