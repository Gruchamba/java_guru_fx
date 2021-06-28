package lesson_09_check_box;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private CheckBox checkBox;

    @FXML
    private Label stateLabel;

    @FXML
    private ImageView imageView;

    private final Image imageOff = new Image(getClass().getResourceAsStream("light_off.png"));
    private final Image imageOn = new Image(getClass().getResourceAsStream("light_on.png"));

    public void switchLight() {

        if (checkBox.isSelected()) {
            stateLabel.setText("Лампочка включена");
            imageView.setImage(imageOn);
        } else  {
            stateLabel.setText("Лампочка выключена");
            imageView.setImage(imageOff);
        }

    }
}
