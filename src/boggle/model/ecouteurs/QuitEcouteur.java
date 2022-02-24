package boggle.model.ecouteurs;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class QuitEcouteur implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        Platform.exit();
    }
}