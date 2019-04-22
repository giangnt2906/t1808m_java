package JV2_S6;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Register {
    public TextField txtUser;
    public TextField txtEmail;
    public TextField txtPass;

    public void submitRegister() throws Exception{
        String user = txtUser.getText();
        String pass = txtPass.getText();
        String email = txtEmail.getText();

        Connector connector = new Connector();
        String insert_sql = "INSERT INTO user (username, email, password, status) VALUES ('"+user+"', '"+email+"', '"+pass+"', '1')";
        connector.updateQuery(insert_sql);

        System.out.println("Dang ky thanh cong");
    }

    public void backLogin() throws Exception{
        Parent list = FXMLLoader.load(getClass().getResource("login.fxml"));
        Main.mainStage.getScene().setRoot(list);
    }
}
