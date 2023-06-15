/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Patient;

import View.ViewManger;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class LoginPatientController implements Initializable {

    @FXML
    private Label labelLoginPatient;
    @FXML
    private Button buttonLogin;
    @FXML
    private Button buttonCancel;
    @FXML
    private ImageView imageLogo;
    @FXML
    private Label labelTitel;
    @FXML
    private Label labelUserName;
    @FXML
    private Label labelPassword;
    @FXML
    private TextField textFieldUserName;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button buttonRegister;
    @FXML
    private ImageView PatientImage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonLoginAction(ActionEvent event) throws IOException {
        ViewManger.getPatientDashboard().getPatientDashboardFreeAppointments();
        ViewManger.getPatientDashboard().show();
    }

    @FXML
    private void buttonCancelAction(ActionEvent event) throws IOException {
        ViewManger.getPatientLoginpage().close();
    }

    @FXML
    private void buttonRegisterAction(ActionEvent event) throws IOException {
        ViewManger.getPatientRegisterpage().show();
    }
    
}
