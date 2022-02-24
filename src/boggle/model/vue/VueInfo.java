package boggle.model.vue;

import boggle.model.Boggle;
import boggle.model.Observateur;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.util.ArrayList;

public class VueInfo extends TilePane implements Observateur {
    private Label score;
    private Label motChoisi;
    private Boggle bog;
    private ArrayList<Button> lettreChoisie;
    private StringBuilder mot;

    public VueInfo(Boggle boggle){
        this.bog = boggle;
        bog.setVueInfo(this);
        this.bog.ajouterObservateur(this);
        lettreChoisie = new ArrayList<>();
        motChoisi = new Label("motChoisi : " + bog.getMotChoisi());
        motChoisi.setFont(new Font(20));
        setMinSize(300,100);

        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(motChoisi);

        //Boite sur le coté avec lettre
        VBox boiteGauche = new VBox();
        boiteGauche.setAlignment(Pos.CENTER_LEFT);

    }

    @Override
    public void reagir() {
        motChoisi.setText("motChoisi : " + bog.getMotChoisi());
    }
}
