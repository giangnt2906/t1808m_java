package JV2_S4;
import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField text;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Songuyento snt = new Songuyento();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<20; i++){
                    try {
                        Runnable r2 = new Runnable() {
                            @Override
                            public void run() {
                                text.setText(Integer.toString(snt.SNTnext()));
                            }
                        };
                        Platform.runLater(r2);
                        Thread.sleep(1000);
                    } catch (Exception e){}
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.setDaemon(true);
        t1.start();
    }
}
