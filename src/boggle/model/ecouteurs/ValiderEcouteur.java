package boggle.model.ecouteurs;

import boggle.model.Boggle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ValiderEcouteur implements EventHandler<ActionEvent> {
    private Boggle bog;

    public ValiderEcouteur(Boggle bg){
        this.bog = bg;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        bog.valider();
        bog.notifierObservateurs();
    }
}
