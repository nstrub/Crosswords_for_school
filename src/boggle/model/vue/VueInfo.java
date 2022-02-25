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

    public VueInfo(Boggle boggle){
        this.bog = boggle;
        bog.setVueInfo(this);
        this.bog.ajouterObservateur(this);
        motChoisi = new Label("Ton mot : " + bog.getMotChoisi());
        motChoisi.setFont(new Font(20));
        this.setMinSize(300,100);
        this.setAlignment(Pos.CENTER);
        score = new Label("Score : " + bog.getScore());
        score.setFont(new Font(20));

        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(motChoisi,score);

    }

    @Override
    public void reagir() {
        motChoisi.setText("Ton mot : " + bog.getMotChoisi() + " ");
        score.setText("Score : " + bog.getScore());
    }
}
