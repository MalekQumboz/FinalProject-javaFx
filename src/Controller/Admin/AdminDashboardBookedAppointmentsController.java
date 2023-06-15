/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

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
public class AdminDashboardBookedAppointmentsController implements Initializable {

    @FXML
    private Label labelAdminDashboard;
    @FXML
    private Label labelDoctorFunction;
    @FXML
    private Button buttonShowAllRegisterdPatients;
    @FXML
    private Button buttonSearchInPatientsByFirstName;
    @FXML
    private Button buttonShowMyAllBookedAppointments;
    @FXML
    private Button buttonCRUDPatient;
    @FXML
    private Button buttonShowMyAllFreeAppointments;
    @FXML
    private Button buttonCRUDAppointment;
    @FXML
    private Button buttonSearchInBookedByFirstName;
    @FXML
    private Button buttonLeaveAComment;
    @FXML
    private Button logout;
    @FXML
    private Label labelFunctionOfThePatient;
    @FXML
    private Label labelFunctionOfThelabelFunctionOfBookedAppointments;
    @FXML
    private Label labelFunctionOfThelabelFunctionOfFreeAppointments;
    @FXML
    private Label labelTitel;
    @FXML
    private Button btnSearchInBookedAppointments;
    @FXML
    private TableView<?> bookedTableView;
    @FXML
    private TableColumn<?, ?> idBookedCol;
    @FXML
    private TableColumn<?, ?> userIdCol;
    @FXML
    private TableColumn<?, ?> appIdCol;
    @FXML
    private TableColumn<?, ?> statusBookedCol;
    @FXML
    private TableColumn<?, ?> docCommentCol;
    @FXML
    private Button btnShowAllBookedAppointments;
    @FXML
    private Button btnLeaveComment;
    @FXML
    private TextField txtSearchInPatients;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonShowAllRegisterdPatientsAction(ActionEvent event) throws IOException {
        ViewManger.getAdminDashboard().getAdminDashboardPatients();
        ViewManger.getAdminDashboard().show();
    }

    @FXML
    private void buttonSearchInPatientsByFirstNameAction(ActionEvent event) throws IOException {
        ViewManger.getAdminDashboard().getAdminDashboardPatients();
        ViewManger.getAdminDashboard().show();
    }
    
     @FXML
    private void buttonCRUDPatientAction(ActionEvent event) throws IOException {
        ViewManger.getAdminDashboard().getAdminDashboardPatients();
        ViewManger.getAdminDashboard().show();
    }

    @FXML
    private void buttonShowMyAllFreeAppointmentsAction(ActionEvent event) throws IOException {
        ViewManger.getAdminDashboard().getAdminDashboardFreeAppointments();
        ViewManger.getAdminDashboard().show();
    }

    @FXML
    private void buttonCRUDAppointmentAction(ActionEvent event) throws IOException {
        ViewManger.getAdminDashboard().getAdminDashboardFreeAppointments();
        ViewManger.getAdminDashboard().show();
    }
    
    @FXML
    private void buttonShowMyAllBookedAppointmentsAction(ActionEvent event) throws IOException {
        ViewManger.getAdminDashboard().getAdminDashboardBookedAppointments();
        ViewManger.getAdminDashboard().show();
        
    }

    @FXML
    private void buttonSearchInBookedByFirstNameAction(ActionEvent event) throws IOException {
        ViewManger.getAdminDashboard().getAdminDashboardBookedAppointments();
        ViewManger.getAdminDashboard().show();
    }

    @FXML
    private void buttonLeaveACommentAction(ActionEvent event) throws IOException {
        ViewManger.getAdminDashboard().getAdminDashboardBookedAppointments();
        ViewManger.getAdminDashboard().show();
    }

    @FXML
    private void logoutAction(ActionEvent event) throws IOException {     
        ViewManger.getAdminDashboard().getAdminDashboardBookedAppointments();
        ViewManger.getAdminDashboard().close();
    }

    @FXML
    private void btnShowAllBookedAppointmentsAction(ActionEvent event) {
    }

    @FXML
    private void btnLeaveCommentAndFinishAction(ActionEvent event) {
    }

    @FXML
    private void btnSearchInBookedAppointmentsAction(ActionEvent event) {
    }

    
}
