package boggle.model.vue;

import boggle.model.Boggle;
import boggle.model.Observateur;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

public class VueInfo extends TilePane implements Observateur {
    private Label score;
    private Label motChoisi;
    private Boggle bog;

    public VueInfo(Boggle bog){
        this.bog = bog;
        this.bog.ajouterObservateur(this);
    }

    @Override
    public void reagir() {
        //Pas pour le moment...
    }
}
