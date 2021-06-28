package lesson_11_pickers;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;

import java.time.format.DateTimeFormatter;

public class Controller {

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label dateLabel;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private Pane pane;

    public void changeColor() {
        pane.setBackground(
                new Background(
                        new BackgroundFill(
                                colorPicker.getValue(),
                                CornerRadii.EMPTY,
                                Insets.EMPTY
                        )
                )
        );
    }

    public void setText() {
        dateLabel.setText(
                datePicker.getValue().format(
                        DateTimeFormatter.ofPattern("dd-MM-yyyy")
                )
        );
    }
}
