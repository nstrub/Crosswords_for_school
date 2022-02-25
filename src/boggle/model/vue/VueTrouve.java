package boggle.model.vue;

import boggle.model.Boggle;
import boggle.model.Observateur;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

import java.util.ArrayList;

public class VueTrouve extends TilePane implements Observateur {
    private Label laListe;
    private Label titreListe;
    private Boggle bog;

    public VueTrouve(Boggle bg){
        this.bog  = bg;
        titreListe = new Label("Vous avez trouvé :");
        laListe = new Label(bog.afficherValide());

        this.getChildren().addAll(titreListe,laListe);

        this.setAlignment(Pos.TOP_LEFT);
    }


    @Override
    public void reagir() {

    }
}
