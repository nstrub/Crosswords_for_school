package boggle.model.vue;

import boggle.model.Boggle;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class VueMenu extends MenuBar {
    private Menu menu;
    private MenuItem regles;

    private Menu option;
    private RadioMenuItem francais;
    private RadioMenuItem anglais;
    private ToggleGroup language;
    private Menu newGame;
    private MenuItem grilleNormal;
    private MenuItem grilleDur;
    private MenuItem grilleExtreme;


    public VueMenu(Boggle bog){
        //Menu regles
        menu = new Menu("Menu");
        regles = new MenuItem("Règle");

        menu.getItems().add(regles);


        //Option de langue
        option = new Menu("Langue");
        language = new ToggleGroup();
        francais = new RadioMenuItem("Francais");
        francais.setToggleGroup(language);

        francais.setOnAction(event ->{
            bog.languageChoisi(0);
            bog.nouvellePartie(bog.getTaille());
            bog.notifierObservateurs();
        });

        anglais = new RadioMenuItem("English");
        anglais.setToggleGroup(language);

        anglais.setOnAction(event ->{
            bog.languageChoisi(1);
            bog.nouvellePartie(bog.getTaille());
            bog.notifierObservateurs();
        });

        francais.setSelected(true);

        option.getItems().addAll(francais,anglais);

        //Nouvelle partie
        newGame = new Menu("Nouvelle Partie");
        grilleNormal = new MenuItem("Normal");
        grilleDur = new MenuItem("Difficile");
        grilleExtreme = new MenuItem("EXTREME");

        newGame.getItems().addAll(grilleNormal,grilleDur,grilleExtreme);

        //On ajoute le tout en haut
        this.getMenus().addAll(menu,option,newGame);





    }

}
