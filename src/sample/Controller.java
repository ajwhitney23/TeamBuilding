package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField loanAmount;
    @FXML
    TextField loanRate;
    @FXML
    TextField loanMonths;
    @FXML
    Label loanPayment;
    @FXML
    Button btnCalc;

    public void CalculatePayment()
    {
        double amount = Double.parseDouble(loanAmount.getText());
        double rate = Double.parseDouble(loanRate.getText())/12;
        double months = Double.parseDouble(loanMonths.getText());

        double payment = amount * ((rate) / 1-Math.pow((1+rate), -months));

        loanPayment.setText(Double.toString(payment));
    }
}
