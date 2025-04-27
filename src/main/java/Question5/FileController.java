package Question5;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.*;
import java.io.IOException;

public class FileController {
    private Stage stage;  //Reference to the stage in fileApplication

    @FXML
    private TextArea noteText;

    @FXML
    protected void saveFile(){
        //class to load and save text file
        FileChooser fileChooser = new FileChooser();
        //set tile of the dialog window
        fileChooser.setTitle("Save your file");

        //only find .txt file, and add .txt extension to our saved file
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files (*.txt)", "*.txt"));

        //show the saving dialog window
        File savefile = fileChooser.showSaveDialog(stage);

        //get the user text and put it in a file to save
        String notes = noteText.getText().trim();
        //return null when the user cancels the window
        if(savefile != null) {
            try (PrintWriter writer = new PrintWriter(new FileOutputStream(savefile))) {
                writer.write(notes);
            } catch (IOException e) {
                System.err.println("Not saved. There is something wrong with the file");
            }
        }
    }

    @FXML
    protected void loadFile(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Load your file");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files (*.txt)", "*.txt"));

        //show the load dialog window
        File file = fileChooser.showOpenDialog(stage);
        if(file != null) {
            try (BufferedReader read = new BufferedReader(new FileReader(file))){
                String line;
                while ((line = read.readLine()) != null) {
                    noteText.appendText(line + "\n");
                }
            } catch (FileNotFoundException e) {
                System.err.println("File note found");
            } catch (IOException e) {
                System.err.println("Something went wrong");
            }
        }
    }
}
