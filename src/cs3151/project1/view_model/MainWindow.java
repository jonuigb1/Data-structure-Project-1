package cs3151.project1.view_model;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MainWindow {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Anchor;

    @FXML
    private Button RootDirectory;

    @FXML
    private TextField searchText;

    @FXML
    private RadioButton SelectAllFIlesAndDirectories;

    @FXML
    private RadioButton SelectDirectories;

    @FXML
    private RadioButton SelectFiles;

    @FXML
    private RadioButton NameOnly;

    @FXML
    private RadioButton FullPath;

    @FXML
    private TextArea outputTextArea;

    @FXML
    void DisplayRootDirectory(ActionEvent event) {
    	File[] rootDirectory = File.listRoots();
    	for( int i = 0; i < rootDirectory.length; i++) {
    		String result = rootDirectory.toString();
    		this.outputTextArea.setText(result);
    	}
    	

    }

    @FXML
    void getDirectories(ActionEvent event) {

    }

    @FXML
    void getFiles(ActionEvent event) {

    }

    @FXML
    void getFilesAndDirectories(ActionEvent event) {

    }

    @FXML
    void getFullPath(ActionEvent event) {

    }

    @FXML
    void getName(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Anchor != null : "fx:id=\"Anchor\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert RootDirectory != null : "fx:id=\"RootDirectory\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert searchText != null : "fx:id=\"searchText\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert SelectAllFIlesAndDirectories != null : "fx:id=\"SelectAllFIlesAndDirectories\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert SelectDirectories != null : "fx:id=\"SelectDirectories\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert SelectFiles != null : "fx:id=\"SelectFiles\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert NameOnly != null : "fx:id=\"NameOnly\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert FullPath != null : "fx:id=\"FullPath\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert outputTextArea != null : "fx:id=\"outputTextArea\" was not injected: check your FXML file 'MainWindow.fxml'.";

    }
}
