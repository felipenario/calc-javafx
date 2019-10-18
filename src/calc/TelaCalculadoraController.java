package calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaCalculadoraController {

    private double v1 = 0;
    private double v2 = 0;
    private String sinal = "";
    private double r = 0;
    private double vT = 0;
    private double vAux = 0;
    private boolean limpaTela=false;

    @FXML
    private TextField tfvisor;

    @FXML
    private Label campoResult;

    @FXML
    void clearClick(ActionEvent event) {
        v1 = 0;
        vAux = 0;
        v2 = 0;
        vT = 0;
        sinal = "";
        r = 0;
        tfvisor.setText("");
        campoResult.setText("");
    }

    @FXML
    void cleareClick(ActionEvent event) {
        v2 = 0;
        tfvisor.setText("");
        campoResult.setText(String.valueOf(v1) + String.valueOf(sinal));
        
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
        if (limpaTela){
            tfvisor.setText("");
        }
        String num = ((Button) event.getSource()).getText();
        tfvisor.setText(tfvisor.getText().concat(num));
        campoResult.setText(campoResult.getText().concat(num));
        limpaTela=false;
    }

    /* @FXML
    void operacaoClick(ActionEvent event) {
         
      
                 
    }
     */
    @FXML
    void divisaoClick(ActionEvent event) {
        
        
        String num = ((Button) event.getSource()).getText();
           
        if (v1 == 0) {
            
            v1 = Integer.parseInt(tfvisor.getText());
            campoResult.setText(campoResult.getText().concat(num));
           
        } else {
            
            campoResult.setText(campoResult.getText().concat(num));
            resultadoClick(null);
            
        }
         sinal = "/";
        limpaTela = true;

    }

    @FXML
    void maisClick(ActionEvent event) {
            String num = ((Button) event.getSource()).getText();
            
        if (v1 == 0) {
            
            v1 = Integer.parseInt(tfvisor.getText());
            campoResult.setText(campoResult.getText().concat(num));
          
        } else {
            
            campoResult.setText(campoResult.getText().concat(num));
            resultadoClick(null);
            
        }
          sinal = "+";
        limpaTela = true;

    }

    @FXML
    void menosClick(ActionEvent event) {
        String num = ((Button) event.getSource()).getText();
           
        if (v1 == 0) {
            
            v1 = Integer.parseInt(tfvisor.getText());
            campoResult.setText(campoResult.getText().concat(num));
            
        } else {
            
            campoResult.setText(campoResult.getText().concat(num));
            resultadoClick(null);
            
        }
        sinal = "-";
        limpaTela = true;

    }

    @FXML
    void multiClick(ActionEvent event) {

        
        String num = ((Button) event.getSource()).getText();
           
        if (v1 == 0) {
            
            v1 = Integer.parseInt(tfvisor.getText());
            campoResult.setText(campoResult.getText().concat(num));
           
        } else {
            
            campoResult.setText(campoResult.getText().concat(num));
            resultadoClick(null);
            
        }
         sinal = "*";
        limpaTela = true;
        
        
    }

    @FXML
    void porcentagemClick(ActionEvent event) {
        v1 = Double.parseDouble(tfvisor.getText());
        r = v1 / 100;
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

//        v2 = Double.parseDouble(tfvisor.getText());
//        tfvisor.setText(String.valueOf(v1) + "+" + String.valueOf(v2));
        if (event == null) {
            switch (sinal) {
                case "+":
                    v2 = Double.parseDouble(tfvisor.getText());
                    vT = v1 + v2;
                    v1 = vT;
                    tfvisor.setText(String.valueOf(vT));
                    break;

                case "-":
                    
                    v2 = Double.parseDouble(tfvisor.getText());
                    
                    vT = v1 - v2;
                    v1 = vT;
                    tfvisor.setText(String.valueOf(vT));
                    break;

                case "*":
                    v2 = Double.parseDouble(tfvisor.getText());
                    vT = v1 * v2;
                    v1 = vT;
                    tfvisor.setText(String.valueOf(vT));
                    break;

                case "/":
                    v2 = Double.parseDouble(tfvisor.getText());
                    vT = v1 / v2;
                    v1 = vT;
                    tfvisor.setText(String.valueOf(vT));
                    break;
            }
        }else{

        switch(sinal){
            case "+":
                v2 = Double.parseDouble(tfvisor.getText());
                r = vT + v2;
                tfvisor.setText(String.valueOf(r));
                campoResult.setText("");
                v1 = 0;
                v2 = 0;
                vT = 0;
                sinal = "";
                break;
                
           case "-":
                v2 = Double.parseDouble(tfvisor.getText());
                    if(vT < 0){
                    
                    r = vT + v2;
                   v1 = 0;
                     v2 = 0;
                       vT = 0;
                    sinal = "";
                     tfvisor.setText(String.valueOf(r));
                }else{
                    r = vT - v2;
                    v1 = 0;
                     v2 = 0;
                       vT = 0;
                    sinal = "";
                    tfvisor.setText(String.valueOf(r));
        }
                    break;
                
           case "*":
                v2 = Double.parseDouble(tfvisor.getText());
                r = vT * v2;
                tfvisor.setText(String.valueOf(r));
                campoResult.setText("");
                v1 = 0;
                v2 = 0;
                vT = 0;
                sinal = "";
                break;
                
           case "/":
                v2 = Double.parseDouble(tfvisor.getText());
                r = vT / v2;
                tfvisor.setText(String.valueOf(r));
                campoResult.setText("");
                v1 = 0;
                v2 = 0;
                vT = 0;
                sinal = "";
                break;     
        }
    }
        
    }

    @FXML
    void umsobreClick(ActionEvent event) {
        v1 = Double.parseDouble(tfvisor.getText());
        r = 1 / v1;
        tfvisor.setText(String.valueOf(r));
        v1 = 0;
        r = 0;
    }

    @FXML
    void virgulaClick(ActionEvent event) {
        String virgula = ((Button) event.getSource()).getText();
        tfvisor.setText(tfvisor.getText().concat("."));
    }

}
