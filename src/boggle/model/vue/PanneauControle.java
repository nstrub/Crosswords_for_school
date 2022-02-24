package boggle.model.vue;

import boggle.model.Boggle;
import boggle.model.Observateur;
import boggle.model.ecouteurs.EffacerEcouteur;
import boggle.model.ecouteurs.QuitEcouteur;
import boggle.model.ecouteurs.ValiderEcouteur;
import javafx.geometry.Pos;
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
        //Creation des boutons
        valider = new Button("Valider");
        effacer = new Button("Effacer");
        quitter = new Button("Quitter");

        //On les attachent à leur écouteur
        valider.setOnAction(new ValiderEcouteur(this.bog));
        effacer.setOnAction(new EffacerEcouteur(this.bog));
        quitter.setOnAction(new QuitEcouteur());

        //Pour les afficher...
        this.getChildren().addAll(valider,effacer,quitter);
        this.setAlignment(Pos.CENTER);

        valider.setMinSize(100,40);
        valider.setMaxSize(100,40);
        valider.setStyle("-fx-base:#2c9a00; -fx-background-radius:70");

        effacer.setMinSize(100,40);
        effacer.setMaxSize(100,40);
        effacer.setStyle("-fx-base:#9a0000; -fx-background-radius:70");

        quitter.setMinSize(100,40);
        quitter.setMaxSize(100,40);
        quitter.setStyle("-fx-base:#9a0000; -fx-background-radius:70");

    }





    @Override
    public void reagir() {

    }
}