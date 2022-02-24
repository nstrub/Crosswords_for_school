package boggle.model.ecouteurs;

import boggle.model.Boggle;
import javafx.event.Event;
import javafx.event.EventHandler;

public class LettreEcouteur implements EventHandler {

    private Boggle bog;
    private int ligne;
    private int colonne;

    public LettreEcouteur(Boggle boggle, int ligne, int colonne){
        bog = boggle;
        this.ligne = ligne;
        this.colonne = colonne;
    }


    @Override
    public void handle(Event event) {
        bog.ajouterLettre(ligne,colonne);
        bog.notifierObservateurs();
    }
}
