package boggle.model.vue;

import boggle.model.Boggle;
import boggle.model.Observateur;
import boggle.model.ecouteurs.QuitEcouteur;
import boggle.model.ecouteurs.ValiderEcouteur;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

public class PanneauControle extends TilePane implements Observateur{
//connait model info et lettre (boggle)

    private Button valider;
    private Button effacer;
    private Button quitter;
    private Boggle bog;

    public PanneauControle(Boggle bog){
        this.bog = bog;
        valider = new Button("Valider");
        effacer = new Button("Effacer");
        quitter = new Button("Quitter");

        valider.setOnAction(new ValiderEcouteur(this.bog));

        quitter.setOnAction(new QuitEcouteur());



    }





    @Override
    public void reagir() {

    }
}