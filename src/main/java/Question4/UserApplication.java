package Question4;

import Question3.BookApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(UserApplication.class.getResource("user-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Find User by ID");
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
