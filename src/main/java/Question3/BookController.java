package Question3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class BookController {
    @FXML
    private TextField titleText;
    @FXML
    private TextField authorText;
    @FXML
    private TextField isbnText;

    @FXML
    private TableView<Book> bookTable;
    @FXML
    private TableColumn<Book, String> titleColumn;
    @FXML
    private TableColumn<Book, String> authorColumn;
    @FXML
    private TableColumn<Book, String> isbnColumn;

    @FXML
    private ObservableList<Book> bookList = FXCollections.observableArrayList();


    @FXML
    private void initialize() {
        /**
         * Initializes the TableView columns:
         * connects each column to get the getters of the Book class (getTitle, getAuthor, getIsbn)
         */
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
        isbnColumn.setCellValueFactory(new PropertyValueFactory<>("isbn"));

        // Connect the table to the observable list
        bookTable.setItems(bookList);
    }

    @FXML
    protected void add(){
        String title = titleText.getText();
        String author = authorText.getText();
        String isbn = isbnText.getText();

        if(title.isEmpty() || author.isEmpty() || isbn.isEmpty()){
            System.out.println("a text field is empty");
            return;
        }

        Book myBook = new Book(title, author, isbn);
        bookList.add(myBook);

        //clear the user input for the next input
        titleText.clear();
        authorText.clear();
        isbnText.clear();
    }
}
