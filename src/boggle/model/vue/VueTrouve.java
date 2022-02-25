package boggle.model.vue;

import boggle.model.Boggle;
import boggle.model.Observateur;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;

public class VueTrouve extends ScrollPane implements Observateur {
    private Label lesMots;
    private Boggle bog;

    public VueTrouve(Boggle bg){
        this.bog  = bg;
        bog.ajouterObservateur(this);
        lesMots = new Label("Vous avez trouvé :\n" + bog.getMotsValides());

        this.setContent(lesMots);
        this.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        this.setPadding(new Insets(5));
    }


    @Override
    public void reagir() {
        lesMots.setText("Vous avez trouvé :\n" + bog.getMotsValides());
    }
}