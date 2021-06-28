package lesson_12_slider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label temperatureLbl;

    @FXML
    private Slider temperatureSlider;

    public void changeSlider() {
        System.err.println(temperatureSlider.getValue());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        temperatureSlider.valueProperty().addListener(
                (observableValue, number, t1) -> temperatureLbl.setText(String.valueOf((int)temperatureSlider.getValue()))
        );
    }
}
