package boggle.model.ecouteurs;

import boggle.model.Boggle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EffacerEcouteur implements EventHandler<ActionEvent> {
    private Boggle bog;

    public EffacerEcouteur(Boggle bg){
        this.bog = bg;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        bog.effacer();
        bog.notifierObservateurs();
    }
}
