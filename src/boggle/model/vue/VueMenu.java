package boggle.model.vue;

import boggle.model.Boggle;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.Popup;

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
    private Alert pop;


    public VueMenu(Boggle bog){
        //Menu regles
        menu = new Menu("Menu");
        pop = new Alert(Alert.AlertType.INFORMATION);
        pop.setTitle("Règles");
        pop.setHeaderText("Voici les règles du jeu : BOGGLE");
        pop.setContentText("Le but de ce jeu est de former des mots à partir des lettres dans la grille face à vous.\n\n" +
                "Pour ce faire, vous devez former une chaîne de lettres puis appuyer sur le bouton (Valider). Plus le mot est long plus vous aurez de points ! (Longueur 2 = 1pt; Longueur 3 = 2 pts etc...)\n" +
                "Si vous avez fait une faute, le bouton (Effacer) est là pour ça !\n\n" +
                "Plusieurs options sont à vous :\n" +
                "- Le choix du langage entre Français et Anglais\n" +
                "- Choisir la taille de la grille dans l'onglet (Nouvelle Partie)\n" +
                "\nBonne Chance et Bon Jeu !! :)");
        regles = new MenuItem("Règle");
        regles.setOnAction(event ->{
            pop.showAndWait();
        });
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
        grilleNormal.setOnAction(event ->{
            bog.nouvellePartie(4);
            bog.notifierObservateurs();
        });
        grilleDur = new MenuItem("Difficile");
        grilleDur.setOnAction(event ->{
            bog.nouvellePartie(6);
            bog.notifierObservateurs();
        });
        grilleExtreme = new MenuItem("EXTREME");
        grilleExtreme.setOnAction(event ->{
            bog.nouvellePartie(9);
            bog.notifierObservateurs();
        });
        newGame.getItems().addAll(grilleNormal,grilleDur,grilleExtreme);

        //On ajoute le tout en haut
        this.getMenus().addAll(menu,option,newGame);





    }

}
