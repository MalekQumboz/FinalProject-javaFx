/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Patient;

import Model.DBConnection;
import Model.Users;
import Model.UsersJpaController;
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
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RegisterPatientController implements Initializable {

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
        
//        DBConnection.getInstance();

        String username = this.textFieldUserName.getText();
        System.out.println(username);
        String password = this.PasswordField.getText();
        System.out.println(password);
        String firstName = this.textFieldFirstName.getText();
        System.out.println(firstName);
        String lastName = this.textFieldLastName.getText();
        System.out.println(lastName);
        String email = this.textFieldEmail.getText();
        System.out.println(email);
        String phone = this.textFieldPhone.getText();
        System.out.println(phone);
        String gender = this.ToggleGroupGender.getSelectedToggle().toString();
        System.out.println(gender);
        String role = this.ToggleGroupRole.getSelectedToggle().toString();
        System.out.println(role);

//        Toggle selectedGenderToggle = this.ToggleGroupGender.getSelectedToggle();
//        if (selectedGenderToggle != null) {
//            gender = selectedGenderToggle.toString();
//        }

//        Toggle selectedRoleToggle = this.ToggleGroupRole.getSelectedToggle();
//        if (selectedRoleToggle != null) {
//            role = selectedRoleToggle.toString();
//        }

        int age = Integer.parseInt(this.textFieldAge.getText());
        System.out.println(age);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Final_Project_Prog3PU");
        System.out.println("emf");
        UsersJpaController usersController = new UsersJpaController(emf);
        System.out.println("usercon");
        Users user = new Users(null, username, password, firstName, lastName, age, email, phone, gender, role);
//        Users user = new Users();
//        user.setAge(age);
//        user.setEmail(email);
//        user.setFirstName(firstName);
//        user.setGender(gender);
//        user.setLastName(lastName);
//        user.setPassword(password);
//        user.setPhone(phone);
//        user.setRole(role);
//        user.setUsername(username);
        System.out.println("new user");
        usersController.create(user);
        System.out.println("create");
    }

    @FXML
    private void buttonCancelAction(ActionEvent event) throws IOException {
        ViewManger.getPatientRegisterpage().close();
    }

}
