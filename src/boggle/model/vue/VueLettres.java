package boggle.model.vue;
import boggle.model.Boggle;
import boggle.model.Observateur;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

public class VueLettres extends TilePane implements Observateur{
    private Button[] bou;

    public VueLettres(Boggle bog){
        int nbBouton = bog.getTaille();
        for(int i = 0; i < nbBouton; i++){

        }
    }

    @Override
    public void reagir() {
        
    }
}
