package calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaCalculadoraController {

    @FXML
    private TextField tfvisor;

    @FXML
    void numberclick(ActionEvent event) {
        String num = ((Button)event.getSource()).getText();
        tfvisor.setText(tfvisor.getText().concat(num));
       
    }

}
