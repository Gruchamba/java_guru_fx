package lesson_07_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class ControllerMainForm {

    @FXML
    Label helloLabel;

    public void deauthorization(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginForm.fxml"));
        Parent parent = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        helloLabel.setText("Hello: ");

        stage.setScene(new Scene(parent));
        stage.show();

    }

    public void setHelloText(String text) {
        helloLabel.setText("Hello: " + text);
    }
}
