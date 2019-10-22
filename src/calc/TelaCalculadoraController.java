package calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaCalculadoraController {

    private double v1 = 0;
    private double v2 = 0;
    private String sinal = "";
    private double r = 0;
    private double vT = 0;
    
    @FXML
    private TextField tfvisor;
    
    @FXML
    void clearClick(ActionEvent event) {
       v1 = 0;
       v2 = 0;
       sinal = "";
       r = 0;
       tfvisor.setText("");
    }

    @FXML
    void cleareClick(ActionEvent event) {
       v2 = 0;
       tfvisor.setText("");
    }
    
    @FXML
    void maismenosClick(ActionEvent event) {
      vT = Double.parseDouble(tfvisor.getText());
      vT = vT * -1;
      tfvisor.setText(String.valueOf(vT));
      vT = 0;
    }

    @FXML
    void numberclick(ActionEvent event) {
        String num = ((Button)event.getSource()).getText();
        tfvisor.setText(tfvisor.getText().concat(num));
       
    }
    
     @FXML
    void operacaoClick(ActionEvent event) {
         
        v1 = Double.parseDouble(tfvisor.getText());
        tfvisor.setText("");
        sinal = ((Button)event.getSource()).getText();
                 
    }
    
     @FXML
    void porcentagemClick(ActionEvent event) {
        v1 = Double.parseDouble(tfvisor.getText());
        r = v1/100;
        tfvisor.setText(String.valueOf(r));
        v1 = 0;
        r = 0;
        
        
    }
    
      @FXML
    void quadradoClick(ActionEvent event) {
        v1 = Double.parseDouble(tfvisor.getText());
        r = Math.pow(v1, 2);
        tfvisor.setText(String.valueOf(r));
        v1 = 0;
        r = 0;
    }
    

    @FXML
    void raizClick(ActionEvent event) {
        v1 = Double.parseDouble(tfvisor.getText());
        r = Math.sqrt(v1);
        tfvisor.setText(String.valueOf(r));
        v1 = 0;
        r = 0;
    }
    
     @FXML
    void resultadoClick(ActionEvent event) {

        v2 = Double.parseDouble(tfvisor.getText());
        
        switch(sinal){
            case "+":
                r = v1 + v2;
                tfvisor.setText(String.valueOf(r));
                break;
                
           case "-":
                r = v1 - v2;
                tfvisor.setText(String.valueOf(r));
                break;
                
           case "*":
                r = v1 * v2;
                tfvisor.setText(String.valueOf(r));
                break;
                
           case "/":
                r = v1 / v2;
                tfvisor.setText(String.valueOf(r));
                break;     
        }
        
        sinal = "";
        v1 = 0;
        v2 = 0;
    }
    @FXML
    void umsobreClick(ActionEvent event) {
        v1 = Double.parseDouble(tfvisor.getText());
        r = 1/v1;
        tfvisor.setText(String.valueOf(r));
        v1 = 0;
        r = 0;
    }
    
     @FXML
    void virgulaClick(ActionEvent event) {
        String virgula = ((Button)event.getSource()).getText();
        tfvisor.setText(tfvisor.getText().concat("."));
    }

}
