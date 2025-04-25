package Question6;

import javafx.beans.binding.StringBinding;
import javafx.beans.value.ObservableListValue;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class toDoListController {

    @FXML
    private TableView<ToDoList> toDoTable;
    @FXML
    private TableColumn<ToDoList, String> toDoColumn;
    @FXML
    private TextField toDoText;
    @FXML
    private Label message;

    @FXML
    private ObservableList<ToDoList> toDoList = FXCollections.observableArrayList();


    @FXML
    protected void addTask(){
        String task = toDoText.getText().trim();

        if(task.isEmpty()) {
            message.setText("Cannot add. No task has been entered");
            return;
        }

        ToDoList list = new ToDoList(task);
        toDoList.add(list);
        toDoText.clear();
        message.setText("Task added successfully");
    }
    @FXML
    protected void deleteSelectedTask(){
        ToDoList selectedTask = toDoTable.getSelectionModel().getSelectedItem();

        if(selectedTask == null){
            message.setText("Cannot delete. No task selected");
        }

        toDoList.remove(selectedTask);
        message.setText("Task deleted successfully");
    }

    @FXML
    private void initialize() {

        // initialize the cell value with the variable names of a class ToDoList
        toDoColumn.setCellValueFactory(new PropertyValueFactory<>("taskToDo"));

        // Connect the table to the observable list
        toDoTable.setItems(toDoList);
    }
}
