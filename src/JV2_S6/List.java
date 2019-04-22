package JV2_S6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class List implements Initializable {
    public TableView<User> txtTableView;
    public TableColumn<User, Integer> txtId;
    public TableColumn<User, String> txtUser;
    public TableColumn<User, String> txtEmail;
    public TableColumn<User, String> txtPass;
    public TableColumn<User, Integer> txtStatus;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtId.setCellValueFactory(new PropertyValueFactory<>("id"));
        txtUser.setCellValueFactory(new PropertyValueFactory<>("username"));
        txtEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        txtPass.setCellValueFactory(new PropertyValueFactory<>("password"));
        txtStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        ObservableList<User> userList = FXCollections.observableArrayList();

        String sqlSelect = "SELECT * FROM user";
        Connector connector = new Connector();
        try {
            ResultSet rs = connector.getQuery(sqlSelect);
            while (rs.next()){
                userList.add(new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getInt("status")
                ));
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        txtTableView.setItems(userList);
    }

    public void backLogin() throws Exception{
        Parent list = FXMLLoader.load(getClass().getResource("login.fxml"));
        Main.mainStage.getScene().setRoot(list);
    }
}
