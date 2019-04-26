package JV2_S6;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.ResultSet;

public class Login {
    public TextField txtUsername;
    public PasswordField txtPassword;

    public void submitLogin() throws Exception{
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        Connector connector = new Connector();
        String sql = "SELECT * FROM user WHERE username LIKE '"+username+"' AND password LIKE '"+password+"'";
        ResultSet rs = connector.getQuery(sql);
        if (rs.next()){
            Parent list = FXMLLoader.load(getClass().getResource("list.fxml"));
            Main.mainStage.getScene().setRoot(list);
        } else {
            Parent list = FXMLLoader.load(getClass().getResource("login.fxml"));
            Main.mainStage.getScene().setRoot(list);
        }

    }

    public void changeRegister() throws Exception{
        Parent list = FXMLLoader.load(getClass().getResource("register.fxml"));
        Main.mainStage.getScene().setRoot(list);
    }
}
