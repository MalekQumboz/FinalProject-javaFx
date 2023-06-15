/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Patient;

import Controller.Admin.*;
import View.ViewManger;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class PatientDashboardFreeAppointmentsController implements Initializable {

    @FXML
    private Button logout;
    @FXML
    private Label labelTitel;
    @FXML
    private TableView<?> freeTableView;
    @FXML
    private TableColumn<?, ?> idCol;
    @FXML
    private TableColumn<?, ?> appDateCol;
    @FXML
    private TableColumn<?, ?> appDayCol;
    @FXML
    private TableColumn<?, ?> appTimeCol;
    @FXML
    private TableColumn<?, ?> statusCol;
    @FXML
    private Label labelPatientDashboard;
    @FXML
    private Label labelPatientFunction;
    @FXML
    private Button buttonShowAllFreeAppointments;
    @FXML
    private Button buttonBookAnAppointment;
    @FXML
    private Button buttonShowMyBookedWaitingAppointments;
    @FXML
    private Button buttonShowMyBookedFinishedAppointments;
    @FXML
    private Label labelAllFunctionOfBookedAppointments;
    @FXML
    private Label labelAllFunctionOfFreeAppointments;
    @FXML
    private Button btnShowAllAppointments;
    @FXML
    private Button btnBookedApp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void buttonShowAllFreeAppointmentsAction(ActionEvent event) throws IOException {
        ViewManger.getPatientDashboard().getPatientDashboardFreeAppointments();
        ViewManger.getPatientDashboard().show();
    }

    @FXML
    private void buttonBookAnAppointmentAction(ActionEvent event) throws IOException {
        ViewManger.getPatientDashboard().getPatientDashboardFreeAppointments();
        ViewManger.getPatientDashboard().show();
    }

    @FXML
    private void buttonShowMyBookedWaitingAppointmentsAction(ActionEvent event) throws IOException {
        ViewManger.getPatientDashboard().getPatientDashboardBookedAppointments();
        ViewManger.getPatientDashboard().show();
    }

    @FXML
    private void buttonShowMyBookedFinishedAppointmentsAction(ActionEvent event) throws IOException {
        ViewManger.getPatientDashboard().getPatientDashboardBookedAppointments();
        ViewManger.getPatientDashboard().show();
    }


    @FXML
    private void btnbookAppointmentAction(ActionEvent event) {
    }
    

    @FXML
    private void btnShowAllFreeAppointmentsAction(ActionEvent event) {
    }
    
    @FXML
    private void logoutAction(ActionEvent event) throws IOException {
        ViewManger.getPatientDashboard().getPatientDashboardFreeAppointments();
        ViewManger.getPatientDashboard().close();
    }
    
}
