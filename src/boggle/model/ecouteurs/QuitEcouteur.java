package boggle.model.ecouteurs;

import boggle.model.Boggle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class QuitEcouteur implements EventHandler<ActionEvent> {

    public QuitEcouteur(){
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        Platform.exit();
    }
}