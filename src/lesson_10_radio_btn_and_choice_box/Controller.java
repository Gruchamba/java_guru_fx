package lesson_10_radio_btn_and_choice_box;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private Label selectedEatLabel;

    @FXML
    private RadioButton pizzaBtn, sushiBtn, ramenBtn;

    @FXML
    private ChoiceBox<String> choiceBox;

    public void selectRadioEat() {

        if (pizzaBtn.isSelected())
            selectedEatLabel.setText(pizzaBtn.getText());
        else if (sushiBtn.isSelected())
            selectedEatLabel.setText(sushiBtn.getText());
        else if (ramenBtn.isSelected())
            selectedEatLabel.setText(ramenBtn.getText());


    }

    public void selectChoiceEat(ActionEvent event) {
        System.err.println(choiceBox.getValue());
        selectedEatLabel.setText(String.valueOf(choiceBox.getValue()));
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().addAll(
                pizzaBtn.getText(),
                sushiBtn.getText(),
                ramenBtn.getText()
        );

        choiceBox.setOnAction(this::selectChoiceEat);
    }
}
