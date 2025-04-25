package Question4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class UserController {
    @FXML
    private TextField nameText;
    @FXML
    private TextField idText;
    @FXML
    private TextField searchID;
    @FXML
    private Label resultText;


    @FXML
    private ArrayList<User> userList = new ArrayList<>();


    @FXML
    protected void addEmployee(){
        String name = nameText.getText().trim();
        String id = idText.getText().trim();


        if(name.isEmpty() || id.isEmpty()){
            resultText.setText("a text field is empty");
            return;
        }

        User myUser = new User(name, id);
        userList.add(myUser);

        //clear the user input for the next input
        nameText.clear();
        idText.clear();
        resultText.setText("Employee registered successfully");
    }

    @FXML
    protected void searchButton(){
        String search = searchID.getText().trim();

        if(search.isEmpty()){
            resultText.setText("No text has been entered");
            return;
        }

        for(User user : userList){
            if(user.getId().equals(search)){
                resultText.setText("Employee found: " + user.getName());
                searchID.clear();
                return;
            }
        }

        searchID.clear();
        resultText.setText("No employee found");
    }
}
