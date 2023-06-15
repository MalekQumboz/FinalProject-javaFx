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
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RegisterPatientFormAdminController implements Initializable {

    @FXML
    private Label labelName;
    @FXML
    private Label labelAge;
    @FXML
    private Label labelEmail;
    @FXML
    private Label labelPhone;
    @FXML
    private Label labelGender;
    @FXML
    private Label labelRole;
    @FXML
    private Label labelPassword;
    @FXML
    private Label labelUserName;
    @FXML
    private TextField textFieldLastName;
    @FXML
    private TextField textFieldFirstName;
    @FXML
    private Label labelFirstName;
    @FXML
    private Label labelLastName;
    @FXML
    private TextField textFieldPhone;
    @FXML
    private TextField textFieldAge;
    @FXML
    private TextField textFieldEmail;
    @FXML
    private Button buttonRegister;
    @FXML
    private TextField textFieldUserName;
    @FXML
    private PasswordField PasswordField;
    @FXML
    private RadioButton genderFemal;
    @FXML
    private ToggleGroup ToggleGroupGender;
    @FXML
    private RadioButton genderMale;
    @FXML
    private RadioButton roleAdmin;
    @FXML
    private ToggleGroup ToggleGroupRole;
    @FXML
    private RadioButton rolePatient;
    @FXML
    private Button buttonCancel;
    @FXML
    private Label labelTitelCreatPatient;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void buttonRegisterAction(ActionEvent event) {
    }

    @FXML
    private void buttonCancelAction(ActionEvent event) throws IOException {
        ViewManger.getAdminDashboard().getAdminDashboardPatients();
        ViewManger.getAdminDashboard().show();
    }

}
