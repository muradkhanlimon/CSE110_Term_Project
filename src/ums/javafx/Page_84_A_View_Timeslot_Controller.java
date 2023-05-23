/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ums.javafx;

import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ums.coreclasses.Timeslot;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_84_A_View_Timeslot_Controller implements Initializable {

    @FXML
    private TableColumn<Timeslot, Integer> timeSlotIdCol;
    @FXML
    private TableColumn<Timeslot, String> dayCol;
    @FXML
    private TableColumn<Timeslot, LocalTime> startTimeCol;
    @FXML
    private TableColumn<Timeslot, LocalTime> endTimeCol;
    @FXML
    private Button backButton;
    @FXML
    private TableView<Timeslot> timeslotTableview;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timeSlotIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        dayCol.setCellValueFactory(new PropertyValueFactory<>("day"));
        startTimeCol.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        endTimeCol.setCellValueFactory(new PropertyValueFactory<>("endTime"));

        timeslotTableview.getItems().addAll(UmsFile.timeslotList.values());
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
