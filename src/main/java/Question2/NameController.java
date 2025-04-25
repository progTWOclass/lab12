package Question2;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NameController {
    @FXML
    private TextField fnText;
    @FXML
    private TextField lnText;

    @FXML
    protected void submit() {
        String fname = fnText.getText();
        String lname = lnText.getText();
        System.out.println("Name: " + fname + " " + lname);
    }

}
