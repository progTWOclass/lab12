module com.example.lab12 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens com.example.lab12 to javafx.fxml;
    opens Question2 to javafx.fxml;
    opens Question3 to javafx.fxml;
    opens Question4 to javafx.fxml;
    opens Question5 to javafx.fxml;
    opens Question6 to javafx.fxml;
    exports com.example.lab12;
    exports Question2;
    exports Question3;
    exports Question4;
    exports Question5;
    exports Question6;
}