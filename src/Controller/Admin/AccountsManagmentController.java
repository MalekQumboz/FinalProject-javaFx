/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class AccountsManagmentController implements Initializable {

    @FXML
    private Button buttonCreateNewPatient;
    @FXML
    private Button buttonShowAllPatient;
    @FXML
    private TextField textFieldPatientSearch;
    @FXML
    private Button buttonSearchPatient;
    @FXML
    private Button buutonUpdateSelectedPatientn;
    @FXML
    private Button buttonDeleteSelectedPatient;
    @FXML
    private Label labelAdminDashbord;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonCreateNewPatientAction(ActionEvent event) {
    }

    @FXML
    private void buttonShowAllPatientAction(ActionEvent event) {
    }

    @FXML
    private void buttonSearchPatientAction(ActionEvent event) {
    }

    @FXML
    private void buutonUpdateSelectedPatientnAction(ActionEvent event) {
    }

    @FXML
    private void buttonDeleteSelectedPatientAction(ActionEvent event) {
    }
    
}
