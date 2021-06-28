package lesson_05_css;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.swing.*;

public class HelloCssController {

    public static int count = 0;

    @FXML
    private Button updateText;

    @FXML
    private Label textLabel;

    public void updateText() {
        textLabel.setText("Считаем: " + count++);
    }

}
