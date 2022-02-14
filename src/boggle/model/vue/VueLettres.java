package boggle.model.vue;
import boggle.model.Boggle;
import boggle.model.Observateur;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;

import java.util.ArrayList;

public class VueLettres extends GridPane implements Observateur{
    private ArrayList<Button> boutons;
    private Boggle bog;

    public VueLettres(Boggle bog){
        boutons = new ArrayList<>();
        this.bog = bog;
        this.bog.ajouterObservateur(this);
        Button boutempo;

        int nbBouton = bog.getTaille();
        for(int i = 0; i < nbBouton; i++){
            for(int j = 0; j < nbBouton; j++){
                boutempo = new Button();
                boutempo.setText(String.valueOf(bog.getLettre(j,i)));
                boutempo.setMinSize(60,60);
                boutons.add(boutempo);
                this.add(boutempo,i,j);

            }
        }
        this.setPadding(new Insets(10));
        this.setHgap(5);
        this.setVgap(5);
        this.setAlignment(Pos.CENTER);
    }

    @Override
    public void reagir() {
        
    }
}
