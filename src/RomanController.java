import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

public class RomanController {

    RomanMethod method = new RomanMethod();

    @FXML
    private Button convert;

    @FXML
    private MenuButton fromButton;

    @FXML
    private MenuItem fromNumber;

    @FXML
    private MenuItem fromRoman;

    @FXML
    private TextArea inputField;

    @FXML
    private TextArea outputField;

    @FXML
    private Button reset;

    @FXML
    private MenuButton toButton;

    @FXML
    private MenuItem toNumber;

    @FXML
    private MenuItem toRoman;

    
    @FXML
    void handleFromNumber(ActionEvent event) {
        fromButton.setText("Number");
        toButton.setText("Roman");
    }
    
    @FXML
    void handleFromRoman(ActionEvent event) {
        fromButton.setText("Roman");
        toButton.setText("Number");
    }
    
    @FXML
    void handleToNumber(ActionEvent event) {
        fromButton.setText("Roman");
        toButton.setText("Number");
    }
    
    @FXML
    void handleToRoman(ActionEvent event) {
        fromButton.setText("Number");
        toButton.setText("Roman");
    }
    
    @FXML
    void handleConvert(ActionEvent event){
        if (fromButton.getText() == "Roman"){
            String input = inputField.getText();
            System.out.println(input);
            int answer = method.romanToInt(input);
            String answeString = Integer.toString(answer);
            outputField.setText(answeString);
        }
        else if (fromButton.getText() == "Number") {
            try {
                int input = Integer.parseInt(inputField.getText());
                String answer = method.intToRoman(input);
                outputField.setText(answer);
            } catch (NumberFormatException e) {
                // TODO: handle exception
                outputField.setText("Please enter a round number");
            }
        }
    }

    @FXML
    void handleReset(ActionEvent event) {
        inputField.setText("");
        outputField.setText("");
    }

}