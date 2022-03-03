package boggle.model.vue;

import boggle.model.Boggle;
import boggle.model.Observateur;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import javax.swing.plaf.ColorUIResource;

public class VueTrouve extends ScrollPane implements Observateur {
    private Label lesMots;
    private Boggle bog;

    public VueTrouve(Boggle bg){
        this.bog  = bg;
        bog.ajouterObservateur(this);
        lesMots = new Label("Vous avez trouvé :\n" + bog.getMotsValides());
        lesMots.setFont(new Font(18));
        this.setContent(lesMots);
        this.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        this.setPadding(new Insets(5));
        this.setStyle("-fx-background:rgba(0,166,255,0.99)");
    }


    @Override
    public void reagir() {
        lesMots.setText("Vous avez trouvé :\n" + bog.getMotsValides());
    }
}