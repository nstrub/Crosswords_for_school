package boggle.model.vue;
import boggle.model.Boggle;
import boggle.model.Observateur;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

import java.util.ArrayList;

public class VueLettres extends TilePane implements Observateur{
    private ArrayList<Button> boutons;

    public VueLettres(Boggle bog){
        int nbBouton = bog.getTaille(); //a mettre au carré
        for(int i = 0; i < nbBouton; i++){

        }
    }

    @Override
    public void reagir() {
        
    }
}
