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
import ums.coreclasses.Timeslot;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_83_A_Delete_Timeslot_Controller implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private TextField idTF;
    @FXML
    private TextField startHourTF;
    @FXML
    private TextField startMinTF;
    @FXML
    private TextField endHourTF;
    @FXML
    private TextField endMinTF;
    @FXML
    private TextField searchTF;
    @FXML
    private Button searchButton;
    @FXML
    private Button deleteButton;
    @FXML
    private TextField dayTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    Timeslot t = null;
    @FXML
    private void searchButtonHandler(ActionEvent event) {
        int id = Integer.parseInt(searchTF.getText());
        t = UmsFile.timeslotList.get(id);
        
        idTF.setText(t.getId() + "");
        dayTF.setText(t.getDay());
        startHourTF.setText(t.getStartTime().getHour()+"");
        startMinTF.setText(t.getStartTime().getMinute()+"");
        endHourTF.setText(t.getEndTime().getHour()+"");
        endMinTF.setText(t.getEndTime().getMinute()+"");
    }

    @FXML
    private void deleteButtonHandler(ActionEvent event) throws IOException {
        UmsFile.timeslotList.remove(Integer.parseInt(searchTF.getText()));
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
