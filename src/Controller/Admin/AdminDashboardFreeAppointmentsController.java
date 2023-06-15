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
public class AdminDashboardFreeAppointmentsController implements Initializable {

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
    private Button btnShowAllFreeAppointment;
    @FXML
    private Button btnCreateNewPatient;
    @FXML
    private Button btnUpdataPatient;
    @FXML
    private Button btnDelelte;

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
        ViewManger.getAdminDashboard().getAdminDashboardFreeAppointments();
        ViewManger.getAdminDashboard().close();
    }

    @FXML
    private void btnShowAllFreeAppointmentAction(ActionEvent event) {
    }

    @FXML
    private void btncreateNewPatientAction(ActionEvent event) throws IOException {
        ViewManger.getAdminDashboard().getAdminDashboardCreatPatient();
        ViewManger.getAdminDashboard().show();
    }

    @FXML
    private void btnupdatePatientAction(ActionEvent event) throws IOException {
        ViewManger.getAdminDashboard().getAdminDashboardUpdatePatient();
        ViewManger.getAdminDashboard().show();
    }

    @FXML
    private void btndeleltePatientAction(ActionEvent event) {
    }

}
